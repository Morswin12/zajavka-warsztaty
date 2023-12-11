package WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.services;

import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.InputData;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.Overpayment;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.Rate;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.RateAmounts;

public interface ConstantAmountsCalculationService {

    RateAmounts calculate(InputData inputData, Overpayment overpayment);

    RateAmounts calculate(InputData inputData, Overpayment overpayment, Rate previousRate);
}
