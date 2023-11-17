package WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.configuration;

import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.MortgageCalculator;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.Rate;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.RateAmounts;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.Summary;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.services.SummaryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Function;

@Configuration
@ComponentScan(basePackageClasses = MortgageCalculator.class)
public class CalculatorConfiguration {

    @Bean
    public static SummaryService create() {
        return rates -> {
            BigDecimal interestSum = calculate(rates, rate -> rate.rateAmounts().interestAmount());
            BigDecimal overpaymentProvisionSum = calculate(rates, rate -> rate.rateAmounts().overpayment().provisionAmount());
            BigDecimal totalLostSum = interestSum.add(overpaymentProvisionSum);
            BigDecimal totalCapital = calculate(rates, rate -> totalCapital(rate.rateAmounts()));
            return new Summary(interestSum, overpaymentProvisionSum, totalLostSum, totalCapital);
        };
    }

    private static BigDecimal totalCapital(final RateAmounts rateAmounts) {
        return rateAmounts.capitalAmount().add(rateAmounts.overpayment().amount());
    }

    private static BigDecimal calculate(final List<Rate> rates, Function<Rate, BigDecimal> function) {
        return rates.stream()
                .reduce(BigDecimal.ZERO, (sum, next) -> sum.add(function.apply(next)), BigDecimal::add);
    }
}
