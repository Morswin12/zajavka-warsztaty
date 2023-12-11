package WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.services;

import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model.InputData;
import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model.Installment;
import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model.TimePoint;

import java.math.BigDecimal;

public interface TimePointCalculationService {

    TimePoint calculate(final BigDecimal installmentNumber, final InputData inputData);

    TimePoint calculate(BigDecimal installmentNumber, Installment previousInstallment);

}
