package WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.services;

import WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model.InputData;
import WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model.Overpayment;
import WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model.Rate;
import WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model.RateAmounts;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AmountsCalculationServiceImpl implements AmountsCalculationService {

    private final ConstantAmountsCalculationService constantAmountsCalculationService;

    private final DecreasingAmountsCalculationService decreasingAmountsCalculationService;

//    public AmountsCalculationServiceImpl(
//        final ConstantAmountsCalculationService constantAmountsCalculationService,
//        final DecreasingAmountsCalculationService decreasingAmountsCalculationService
//    ) {
//        this.constantAmountsCalculationService = constantAmountsCalculationService;
//        this.decreasingAmountsCalculationService = decreasingAmountsCalculationService;
//    }

    @Override
    public RateAmounts calculate(final InputData inputData, final Overpayment overpayment) {
        switch (inputData.getRateType()) {
            case CONSTANT:
                return constantAmountsCalculationService.calculate(inputData, overpayment);
            case DECREASING:
                return decreasingAmountsCalculationService.calculate(inputData, overpayment);
            default:
                throw new MortgageException("Case not handled");
        }
    }

    @Override
    public RateAmounts calculate(final InputData inputData, final Overpayment overpayment, final Rate previousRate) {
        switch (inputData.getRateType()) {
            case CONSTANT:
                return constantAmountsCalculationService.calculate(inputData, overpayment, previousRate);
            case DECREASING:
                return decreasingAmountsCalculationService.calculate(inputData, overpayment, previousRate);
            default:
                throw new MortgageException("Case not handled");
        }
    }


}
