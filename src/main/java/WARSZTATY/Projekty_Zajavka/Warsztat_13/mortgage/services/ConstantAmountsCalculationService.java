package WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.services;

import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.InputData;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.Overpayment;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.Rate;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.RateAmounts;

public interface ConstantAmountsCalculationService {

    RateAmounts calculate(InputData inputData, Overpayment overpayment);

    RateAmounts calculate(InputData inputData, Overpayment overpayment, Rate previousRate);
}
