package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class Rate {

    BigDecimal rateNumber;
    TimePoint timePoint;
    RateAmounts rateAmounts;
    MortgageResidual mortgageResidual;
    MortgageReference mortgageReference;

}
