package WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum MortgageType {
    CONSTANT("CONSTANT"),
    DECREASING("DECREASING");
    @Getter
    private final String value;
}
