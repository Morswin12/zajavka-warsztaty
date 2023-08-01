package WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.services;

import WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model.InputData;
import WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model.Overpayment;
import WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model.Rate;
import WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model.RateAmounts;

public interface ConstantAmountsCalculationService {

    RateAmounts calculate(InputData inputData, Overpayment overpayment);

    RateAmounts calculate(InputData inputData, Overpayment overpayment, Rate previousRate);
}
