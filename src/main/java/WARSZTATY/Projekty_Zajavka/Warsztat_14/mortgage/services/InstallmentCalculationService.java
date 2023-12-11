package WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.services;

import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model.InputData;
import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model.Installment;

import java.util.List;

public interface InstallmentCalculationService {

    List<Installment> calculate(InputData inputData);
}
