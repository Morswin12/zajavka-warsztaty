package WARSZTATY.MOJE_PROGRAMY.Kursy_Walut;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class PrzeliczNaPLN {
    private List<ZarobkiMiesieczne> zarobkiMiesieczne;
    private WczytajKursNBP_DlaPodanejDaty wczytajKursNBPDlaPodanejDaty;
    private BigDecimal dochudBruttoPLN = BigDecimal.ZERO;
    private BigDecimal dochudNettoPLN = BigDecimal.ZERO;
    private BigDecimal podatkiSumaPLN = BigDecimal.ZERO;


    public PrzeliczNaPLN(List<ZarobkiMiesieczne> zarobkiMiesieczne) {
        this.zarobkiMiesieczne = zarobkiMiesieczne;
    }

    public void metodaPLN() {
        for (ZarobkiMiesieczne miesieczne : zarobkiMiesieczne) {
            List<Nowy_Przelew> listaPrzelewow = miesieczne.getListaPrzelewow();
            for (Nowy_Przelew nowyPrzelew : listaPrzelewow) {
                BigDecimal kursISK = new WczytajKursNBP_DlaPodanejDaty(nowyPrzelew.getDataPrzelewu()).getKursWBigDecimal();
                dochudBruttoPLN = dochudBruttoPLN.add(nowyPrzelew.getBrutto().multiply(kursISK))
                        .setScale(2, RoundingMode.HALF_UP);
                dochudNettoPLN = dochudNettoPLN.add(nowyPrzelew.getNetto().multiply(kursISK))
                        .setScale(2, RoundingMode.HALF_UP);
                podatkiSumaPLN = podatkiSumaPLN.add(nowyPrzelew.getTaxes().multiply(kursISK))
                        .setScale(2, RoundingMode.HALF_UP);
            }
        }
        System.out.println();
        System.out.println("dochudBruttoPLN: " + dochudBruttoPLN + " PLN");
        System.out.println("dochudNettoPLN: " + dochudNettoPLN + " PLN");
        System.out.println("podatkiSumaPLN: " + podatkiSumaPLN + " PLN");
    }


}
