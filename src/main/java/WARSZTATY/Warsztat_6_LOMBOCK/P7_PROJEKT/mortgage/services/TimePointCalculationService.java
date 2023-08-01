package WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.services;

import WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model.InputData;
import WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model.Rate;
import WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model.TimePoint;

import java.math.BigDecimal;

public interface TimePointCalculationService {

    TimePoint calculate(final BigDecimal rateNumber, final InputData inputData);

    TimePoint calculate(BigDecimal rateNumber, Rate previousRate);

}
