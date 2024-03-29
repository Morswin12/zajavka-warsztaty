package WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model;

import java.math.BigDecimal;

public record Summary(
    BigDecimal interestSum,
    BigDecimal overpaymentProvisionSum,
    BigDecimal totalLostSum,
    BigDecimal totalCapital
) {}
