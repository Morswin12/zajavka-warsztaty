package WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class MortgageResidual {

    BigDecimal residualAmount;

    BigDecimal residualDuration;
}
