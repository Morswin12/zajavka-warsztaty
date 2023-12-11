package WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.services;

import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.InputData;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.Rate;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.TimePoint;

import java.math.BigDecimal;

public interface TimePointCalculationService {

    TimePoint calculate(final BigDecimal rateNumber, final InputData inputData);

    TimePoint calculate(BigDecimal rateNumber, Rate previousRate);

}
