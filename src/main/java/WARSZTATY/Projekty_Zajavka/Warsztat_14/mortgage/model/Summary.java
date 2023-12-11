package WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model;

import lombok.Builder;
import lombok.With;

import java.math.BigDecimal;

@With
public record Summary(
    BigDecimal interestSum,
    BigDecimal overpaymentProvisionSum,
    BigDecimal totalLostSum,
    BigDecimal totalCapital
) {

    @Builder
    public Summary {
    }
}
