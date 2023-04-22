package WARSZTATY.MOJ_NOTATNIK.Kursy_Walut;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZarobkiMiesieczne {
    List<Nowy_Przelew> listaPrzelewow = new ArrayList<>();
    private Integer miesiac;
    private Integer year;
    private Nowy_Przelew nowyPrzelew;
    private BigDecimal bruttoSum = BigDecimal.ZERO;
    private BigDecimal nettoSum = BigDecimal.ZERO;
    private BigDecimal taxesSum = BigDecimal.ZERO;
    private Integer iloscPrzelewowWMiesiacu = 0;

    public ZarobkiMiesieczne(Integer year, Integer miesiac) {
        this.miesiac = miesiac;
        this.year = year;
    }

    public ZarobkiMiesieczne addPrzelew(Nowy_Przelew nowyPrzelew) {
        iloscPrzelewowWMiesiacu++;
        listaPrzelewow.add(nowyPrzelew);
        add(nowyPrzelew);
        return this;
    }

    private void add(Nowy_Przelew nowyPrzelew) {
        this.bruttoSum = this.bruttoSum.add(nowyPrzelew.getBrutto());
        this.nettoSum = this.nettoSum.add(nowyPrzelew.getNetto());
        this.taxesSum = this.taxesSum.add(nowyPrzelew.getTaxes());
    }

    public Integer getMiesiac() {
        return miesiac;
    }

    public Integer getYear() {
        return year;
    }

    public BigDecimal getBruttoSum() {
        return bruttoSum;
    }

    public BigDecimal getNettoSum() {
        return nettoSum;
    }

    public BigDecimal getTaxesSum() {
        return taxesSum;
    }

    public List<Nowy_Przelew> getListaPrzelewow() {
        return listaPrzelewow;
    }

    public Nowy_Przelew getNowyPrzelew() {
        return nowyPrzelew;
    }

    public Integer getIloscPrzelewowWMiesiacu() {
        return iloscPrzelewowWMiesiacu;
    }

    @Override
    public String toString() {
        return "ZarobkiMiesieczne: " +
                "\nmiesiac = " + miesiac +
                "\nyear=" + year +
//                "\nlistaPrzelewow=" + listaPrzelewow +
//                "\nnowyPrzelew=" + nowyPrzelew +
                "\nbruttoSum=" + bruttoSum + " ISK "+
                "\nnettoSum=" + nettoSum + " ISK "+
                "\nprzelewow w miesiacu=" + iloscPrzelewowWMiesiacu +
                "\ntaxesSum=" + taxesSum + " ISK ";
    }
}
