package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT;

import java.math.BigDecimal;

public class Money {
    private final BigDecimal value;
    private final Currency currency;
    // konstruktory, gettery itp

    public Money(BigDecimal value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public enum Currency {
        PLN,
        EUR
    }
}