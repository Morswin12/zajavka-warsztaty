package WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.services;

import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.InputData;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.MortgageReference;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.Rate;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.RateAmounts;

public interface ReferenceCalculationService {

    MortgageReference calculate(RateAmounts rateAmounts, InputData inputData);

    MortgageReference calculate(RateAmounts rateAmounts, final InputData inputData, Rate previousRate);

}
