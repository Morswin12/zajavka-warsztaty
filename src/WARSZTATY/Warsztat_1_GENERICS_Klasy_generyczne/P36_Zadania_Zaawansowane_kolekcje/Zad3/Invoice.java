package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P36_Zadania_Zaawansowane_kolekcje.Zad3;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Invoice {
    private String id;
    private static int counter = 0;
    private BigDecimal amount;

    public Invoice(BigDecimal amount) {
        counter++;
        this.amount = amount;
        id = "" + counter + "/"+ LocalDate.now().getYear();
    }

    public String getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "{ID: " + id + ", AMOUNT: " + amount +
                '}';
    }
}
