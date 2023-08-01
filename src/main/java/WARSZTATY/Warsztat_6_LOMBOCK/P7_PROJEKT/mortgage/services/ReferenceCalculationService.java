package WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.services;

import WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model.InputData;
import WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model.MortgageReference;
import WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model.Rate;
import WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model.RateAmounts;

public interface ReferenceCalculationService {

    MortgageReference calculate(RateAmounts rateAmounts, InputData inputData);

    MortgageReference calculate(RateAmounts rateAmounts, final InputData inputData, Rate previousRate);

}
