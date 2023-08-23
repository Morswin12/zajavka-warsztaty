package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.services;

import WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model.InputData;
import WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model.MortgageResidual;
import WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model.Rate;
import WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model.RateAmounts;

public interface ResidualCalculationService {

    MortgageResidual calculate(RateAmounts rateAmounts, InputData inputData);

    MortgageResidual calculate(RateAmounts rateAmounts, final InputData inputData, Rate previousRate);

}
