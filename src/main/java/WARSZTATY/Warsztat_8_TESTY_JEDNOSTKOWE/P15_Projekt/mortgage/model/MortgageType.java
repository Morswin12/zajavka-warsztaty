package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum MortgageType {
    CONSTANT("CONSTANT"),
    DECREASING("DECREASING");

    @Getter
    private final String value;

}
