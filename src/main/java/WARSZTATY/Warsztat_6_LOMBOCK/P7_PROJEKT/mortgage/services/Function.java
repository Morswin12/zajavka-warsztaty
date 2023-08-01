package WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.services;

import WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model.Rate;

import java.math.BigDecimal;

public interface Function {

    BigDecimal calculate(Rate rate);
}
