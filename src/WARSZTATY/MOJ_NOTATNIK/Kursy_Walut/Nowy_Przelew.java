package WARSZTATY.MOJ_NOTATNIK.Kursy_Walut;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Nowy_Przelew {
    private BigDecimal brutto = BigDecimal.ZERO;
    private BigDecimal netto = BigDecimal.ZERO;
    private BigDecimal taxes = BigDecimal.ZERO;
    private LocalDate dataPrzelewu;
    private Integer nrPrzelewu;
    private Platnik platnik;
    private static Integer counter = 0;

    public Nowy_Przelew(Platnik platnik, BigDecimal netto, BigDecimal brutto, BigDecimal taxes, LocalDate dataPrzelewu) {
        counter++;
        this.nrPrzelewu = this.counter;
        this.brutto = brutto;
        this.netto = netto;
        this.taxes = taxes;
        this.dataPrzelewu = dataPrzelewu;
        this.platnik = platnik;
    }

    public LocalDate getDataPrzelewu() {
        return dataPrzelewu;
    }

    public BigDecimal getBrutto() {
        return brutto;
    }

    public BigDecimal getNetto() {
        return netto;
    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public Integer getNrPrzelewu() {
        return nrPrzelewu;
    }

    public Platnik getPlatnik() {
        return platnik;
    }

    @Override
    public String toString() {
        return "Nowy_Przelew: " +
                "\nbrutto =       " + brutto + " ISK "+
                "\nnetto =        " + netto + " ISK "+
                "\ntaxes =        " + taxes + " ISK "+
                "\ndataPrzelewu = " + dataPrzelewu +
                "\nnrPrzelewu =   " + nrPrzelewu +
                "\nplatnik =      " + platnik;
    }
}