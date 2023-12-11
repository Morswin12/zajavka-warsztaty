package WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.services;

import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.InputData;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.Overpayment;

import java.math.BigDecimal;

public interface OverpaymentCalculationService {

    Overpayment calculate(final BigDecimal rateNumber, final InputData inputData);
}
