package WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.services;

import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.InputData;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.Overpayment;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.Rate;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.RateAmounts;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AmountsCalculationServiceImpl implements AmountsCalculationService {

    private final ConstantAmountsCalculationService constantAmountsCalculationService;

    private final DecreasingAmountsCalculationService decreasingAmountsCalculationService;

    @Override
    public RateAmounts calculate(final InputData inputData, final Overpayment overpayment) {
        return switch (inputData.rateType()) {
            case CONSTANT -> constantAmountsCalculationService.calculate(inputData, overpayment);
            case DECREASING -> decreasingAmountsCalculationService.calculate(inputData, overpayment);
        };
    }

    @Override
    public RateAmounts calculate(final InputData inputData, final Overpayment overpayment, final Rate previousRate) {
        return switch (inputData.rateType()) {
            case CONSTANT -> constantAmountsCalculationService.calculate(inputData, overpayment, previousRate);
            case DECREASING -> decreasingAmountsCalculationService.calculate(inputData, overpayment, previousRate);
        };
    }


}
