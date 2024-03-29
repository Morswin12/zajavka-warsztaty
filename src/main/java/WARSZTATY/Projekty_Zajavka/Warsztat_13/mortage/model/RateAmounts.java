package WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model;

import java.math.BigDecimal;

public record RateAmounts(
    BigDecimal rateAmount,
    BigDecimal interestAmount,
    BigDecimal capitalAmount,
    Overpayment overpayment
) {}
