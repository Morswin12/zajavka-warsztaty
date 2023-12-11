package WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.services;

import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model.InputData;
import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model.Overpayment;

import java.math.BigDecimal;

public interface OverpaymentCalculationService {

    Overpayment calculate(final BigDecimal installmentNumber, final InputData inputData);
}
