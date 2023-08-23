package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.services;

import WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model.Rate;

import java.math.BigDecimal;

@FunctionalInterface
public interface Function {

    BigDecimal calculate(Rate rate);
}
