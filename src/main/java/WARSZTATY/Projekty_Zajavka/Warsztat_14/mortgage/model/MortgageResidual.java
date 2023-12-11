package WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model;

import lombok.Builder;
import lombok.With;

import java.math.BigDecimal;

@With
public record MortgageResidual(BigDecimal residualAmount, BigDecimal residualDuration) {

    @Builder
    public MortgageResidual {
    }
}
