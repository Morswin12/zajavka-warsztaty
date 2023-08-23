package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class MortgageResidual {

    BigDecimal residualAmount;
    BigDecimal residualDuration;

}
