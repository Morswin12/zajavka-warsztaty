package WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class RateAmounts {

    BigDecimal rateAmount;
    BigDecimal interestAmount;
    BigDecimal capitalAmount;
    Overpayment overpayment;
}