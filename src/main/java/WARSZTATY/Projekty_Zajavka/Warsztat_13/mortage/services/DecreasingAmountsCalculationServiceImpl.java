package WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.services;

import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.InputData;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.Overpayment;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.Rate;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.RateAmounts;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class DecreasingAmountsCalculationServiceImpl implements DecreasingAmountsCalculationService {

    @Override
    public RateAmounts calculate(final InputData inputData, final Overpayment overpayment) {
        BigDecimal interestPercent = inputData.interestPercent();

        final BigDecimal residualAmount = inputData.amount();
        final BigDecimal residualDuration = inputData.monthsDuration();

        BigDecimal interestAmount = AmountsCalculationService.calculateInterestAmount(residualAmount, interestPercent);
        BigDecimal capitalAmount = AmountsCalculationService.compareCapitalWithResidual(
            calculateDecreasingCapitalAmount(residualAmount, residualDuration), residualAmount);
        BigDecimal rateAmount = capitalAmount.add(interestAmount);

        return new RateAmounts(rateAmount, interestAmount, capitalAmount, overpayment);
    }

    @Override
    public RateAmounts calculate(final InputData inputData, final Overpayment overpayment, final Rate previousRate) {
        BigDecimal interestPercent = inputData.interestPercent();

        BigDecimal residualAmount = previousRate.mortgageResidual().residualAmount();
        BigDecimal referenceAmount = previousRate.mortgageReference().referenceAmount();
        BigDecimal referenceDuration = previousRate.mortgageReference().referenceDuration();

        BigDecimal interestAmount = AmountsCalculationService.calculateInterestAmount(residualAmount, interestPercent);
        BigDecimal capitalAmount = AmountsCalculationService.compareCapitalWithResidual(
            calculateDecreasingCapitalAmount(referenceAmount, referenceDuration), residualAmount);
        BigDecimal rateAmount = capitalAmount.add(interestAmount);

        return new RateAmounts(rateAmount, interestAmount, capitalAmount, overpayment);
    }

    private BigDecimal calculateDecreasingCapitalAmount(final BigDecimal residualAmount, final BigDecimal residualDuration) {
        return residualAmount.divide(residualDuration, 2, RoundingMode.HALF_UP);
    }
}
