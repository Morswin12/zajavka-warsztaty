package WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.services;

import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.InputData;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.MortgageResidual;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.Rate;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.RateAmounts;

public interface ResidualCalculationService {

    MortgageResidual calculate(RateAmounts rateAmounts, InputData inputData);

    MortgageResidual calculate(RateAmounts rateAmounts, final InputData inputData, Rate previousRate);

}
