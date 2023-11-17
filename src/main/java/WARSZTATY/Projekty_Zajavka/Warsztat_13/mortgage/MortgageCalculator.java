package WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage;

import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.configuration.CalculatorConfiguration;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.MortgageType;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.Overpayment;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.services.InputDataRepository;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.services.MortgageCalculationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class MortgageCalculator {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CalculatorConfiguration.class);

        InputDataRepository inputDataRepository = context.getBean(InputDataRepository.class);
        final var inputData = inputDataRepository.read();
        if (inputData.isEmpty()) {
            return;
        }
        var overpaymentSchema = new TreeMap<>(
                Map.of(
                        5, BigDecimal.valueOf(12000),
                        19, BigDecimal.valueOf(10000),
                        28, BigDecimal.valueOf(11000),
                        64, BigDecimal.valueOf(16000),
                        78, BigDecimal.valueOf(18000)
                )
        );

        var updatedInputData = inputData.get()
                .withAmount(new BigDecimal("296192.11"))
                .withMonthsDuration(BigDecimal.valueOf(360))
                .withOverpaymentReduceWay(Overpayment.REDUCE_PERIOD)
                .withRateType(MortgageType.DECREASING)
                .withOverpaymentSchema(overpaymentSchema);

        MortgageCalculationService mortgageCalculationService = context.getBean(MortgageCalculationService.class);
        mortgageCalculationService.calculate(updatedInputData);
    }
}
