package WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.services;

import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model.InputData;
import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model.Installment;
import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model.InstallmentAmounts;
import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model.MortgageReference;

public interface ReferenceCalculationService {

    MortgageReference calculate(InstallmentAmounts installmentAmounts, InputData inputData);

    MortgageReference calculate(InstallmentAmounts installmentAmounts, final InputData inputData, Installment previousInstallment);

}
