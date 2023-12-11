package WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.services;

import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model.InputData;
import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model.Installment;
import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model.InstallmentAmounts;
import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model.Overpayment;

public interface DecreasingAmountsCalculationService {

    InstallmentAmounts calculate(InputData inputData, Overpayment overpayment);

    InstallmentAmounts calculate(InputData inputData, Overpayment overpayment, Installment previousInstallment);
}
