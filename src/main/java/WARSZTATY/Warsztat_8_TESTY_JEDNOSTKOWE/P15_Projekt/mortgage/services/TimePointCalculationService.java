package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.services;

import WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model.InputData;
import WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model.Rate;
import WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model.TimePoint;

import java.math.BigDecimal;

public interface TimePointCalculationService {

    TimePoint calculate(final BigDecimal rateNumber, final InputData inputData);

    TimePoint calculate(BigDecimal rateNumber, Rate previousRate);

}
