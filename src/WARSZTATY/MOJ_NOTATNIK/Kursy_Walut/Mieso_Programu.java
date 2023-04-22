package WARSZTATY.MOJ_NOTATNIK.Kursy_Walut;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mieso_Programu {
    private static List<ZarobkiMiesieczne> roczne_zarobki;

    public static void main(String[] args) {
        roczne_zarobki = getZarobkiMiesiecznes();

        System.out.println(roczne_zarobki.get(11).getListaPrzelewow().get(0).getNrPrzelewu());
        System.out.println(roczne_zarobki.get(10).getListaPrzelewow().get(0).toString());
        System.out.println();
        System.out.println(roczne_zarobki.get(10).toString());
        LocalDate dataPrzelewu = roczne_zarobki.get(10).getListaPrzelewow().get(0).getDataPrzelewu();
        System.out.println(dataPrzelewu);

        WczytajKursNBP_DlaPodanejDaty wczytajKursNBPDlaPodanejDaty = new WczytajKursNBP_DlaPodanejDaty(dataPrzelewu);
        System.out.println(wczytajKursNBPDlaPodanejDaty.getKursWBigDecimal());

        new PrzeliczNaPLN(roczne_zarobki).metodaPLN();

        print_informacje();
    }

    private static List<ZarobkiMiesieczne> getZarobkiMiesiecznes() {
        List<ZarobkiMiesieczne> roczne_zarobki = new ArrayList<>();
        roczne_zarobki.add(new ZarobkiMiesieczne(2023, 1).
                addPrzelew(new Nowy_Przelew(Platnik.BEZROBOTNY
                        , BigDecimal.valueOf(357_102.0)
                        , BigDecimal.valueOf(481_808.0)
                        , BigDecimal.valueOf(124_706.0)
                        , LocalDate.of(2022, 1, 5)))
                .addPrzelew(new Nowy_Przelew(Platnik.BEZROBOTNY
                        , BigDecimal.valueOf(346_678.0)
                        , BigDecimal.valueOf(458_751.0)
                        , BigDecimal.valueOf(112_073.0)
                        , LocalDate.of(2022, 1, 21)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2022, 2).
                addPrzelew(new Nowy_Przelew(Platnik.BEZROBOTNY
                        , BigDecimal.valueOf(0.0)
                        , BigDecimal.valueOf(0.0)
                        , BigDecimal.valueOf(0.0)
                        , LocalDate.of(2022, 2, 1)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2022, 3).
                addPrzelew(new Nowy_Przelew(Platnik.BEZROBOTNY
                        , BigDecimal.valueOf(342_818.0)
                        , BigDecimal.valueOf(452_159.0)
                        , BigDecimal.valueOf(109_341.0)
                        , LocalDate.of(2022, 3, 1)))
                .addPrzelew(new Nowy_Przelew(Platnik.BEZROBOTNY
                        , BigDecimal.valueOf(116_624.0)
                        , BigDecimal.valueOf(122_763.0)
                        , BigDecimal.valueOf(6_139.0)
                        , LocalDate.of(2022, 3, 31)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2022, 4).
                addPrzelew(new Nowy_Przelew(Platnik.JOHANNHELGI
                        , BigDecimal.valueOf(170_439.0)
                        , BigDecimal.valueOf(179_797.0)
                        , BigDecimal.valueOf(9_358.0)
                        , LocalDate.of(2022, 4, 29)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2022, 5).
                addPrzelew(new Nowy_Przelew(Platnik.JOHANNHELGI
                        , BigDecimal.valueOf(13_708.0)
                        , BigDecimal.valueOf(21_153.0)
                        , BigDecimal.valueOf(7_445.0)
                        , LocalDate.of(2022, 5, 2)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2022, 6).
                addPrzelew(new Nowy_Przelew(Platnik.RSK
                        , BigDecimal.valueOf(70_269.0)
                        , BigDecimal.valueOf(70_269.0)
                        , BigDecimal.valueOf(0.0)
                        , LocalDate.of(2022, 6, 1)))
                .addPrzelew(new Nowy_Przelew(Platnik.JOHANNHELGI
                        , BigDecimal.valueOf(666_769.0)
                        , BigDecimal.valueOf(1_005_279.0)
                        , BigDecimal.valueOf(338_510.0)
                        , LocalDate.of(2022, 6, 2)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2022, 7).
                addPrzelew(new Nowy_Przelew(Platnik.JOHANNHELGI
                        , BigDecimal.valueOf(696_076.0)
                        , BigDecimal.valueOf(1_055_318.0)
                        , BigDecimal.valueOf(359_242.0)
                        , LocalDate.of(2022, 7, 1)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2022, 8).
                addPrzelew(new Nowy_Przelew(Platnik.JOHANNHELGI
                        , BigDecimal.valueOf(532_120.0)
                        , BigDecimal.valueOf(775_377.0)
                        , BigDecimal.valueOf(243_257.0)
                        , LocalDate.of(2022, 8, 2)))
                .addPrzelew(new Nowy_Przelew(Platnik.BARAN_ZWIAZEK_ZAWODOWY
                        , BigDecimal.valueOf(58_958.0)
                        , BigDecimal.valueOf(58_958.0)
                        , BigDecimal.valueOf(0.0)
                        , LocalDate.of(2022, 8, 15)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2022, 9).
                addPrzelew(new Nowy_Przelew(Platnik.JOHANNHELGI
                        , BigDecimal.valueOf(555_929.0)
                        , BigDecimal.valueOf(816_029.0)
                        , BigDecimal.valueOf(260_100.0)
                        , LocalDate.of(2022, 9, 1)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2022, 10).
                addPrzelew(new Nowy_Przelew(Platnik.JOHANNHELGI
                        , BigDecimal.valueOf(782_271.0)
                        , BigDecimal.valueOf(1_221_235.0)
                        , BigDecimal.valueOf(438_964.0)
                        , LocalDate.of(2022, 10, 3)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2022, 11).
                addPrzelew(new Nowy_Przelew(Platnik.JOHANNHELGI
                        , BigDecimal.valueOf(758_389.0)
                        , BigDecimal.valueOf(1_221_859.0)
                        , BigDecimal.valueOf(460_201.0)
                        , LocalDate.of(2022, 11, 1)))
                .addPrzelew(new Nowy_Przelew(Platnik.BARAN_ZWIAZEK_ZAWODOWY
                        , BigDecimal.valueOf(21_600.0)
                        , BigDecimal.valueOf(21_600.0)
                        , BigDecimal.valueOf(0.0)
                        , LocalDate.of(2022, 11, 15)))
                .addPrzelew(new Nowy_Przelew(Platnik.BARAN_ZWIAZEK_ZAWODOWY
                        , BigDecimal.valueOf(120_000.0)
                        , BigDecimal.valueOf(120_000.0)
                        , BigDecimal.valueOf(0.0)
                        , LocalDate.of(2022, 11, 18)))
                .addPrzelew(new Nowy_Przelew(Platnik.TATA
                        , BigDecimal.valueOf(349_273.0)
                        , BigDecimal.valueOf(463_180.0)
                        , BigDecimal.valueOf(113_907.0)
                        , LocalDate.of(2022, 11, 30)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2022, 12).
                addPrzelew(new Nowy_Przelew(Platnik.TATA
                        , BigDecimal.valueOf(349_273.0)
                        , BigDecimal.valueOf(463_180.0)
                        , BigDecimal.valueOf(113_907.0)
                        , LocalDate.of(2022, 12, 29)))
        );
        return roczne_zarobki;
    }


    private static void print_informacje() {
        for (ZarobkiMiesieczne zarobkiMiesieczne : roczne_zarobki) {
            System.out.println("\nW roku: " + zarobkiMiesieczne.getYear() + " i miesicu "
                    + LocalDate.of(zarobkiMiesieczne.getYear(), zarobkiMiesieczne.getMiesiac(), 1).getMonth()
                    + " było " + zarobkiMiesieczne.getIloscPrzelewowWMiesiacu() + " przelewów."
                    + " \nWyniosły w sumie brutto: " + zarobkiMiesieczne.getBruttoSum() + " ISK, netto: "
                    + zarobkiMiesieczne.getNettoSum() + " ISK, a podatek wyniósł: " + zarobkiMiesieczne.getTaxesSum()
                    + " ISK \n Lista przelewów: "
            );
            for (int i = 0; i < zarobkiMiesieczne.getIloscPrzelewowWMiesiacu(); i++) {
                Nowy_Przelew x = zarobkiMiesieczne.getListaPrzelewow().get(i);
                System.out.println("Nr. " + x.getNrPrzelewu() + " od: " + x.getPlatnik() + " w dniu: "
                        + x.getDataPrzelewu() + " na kwote brutto: " + x.getBrutto() + " ISK, netto: "
                        + x.getNetto() + " ISK, oraz podatek: " + x.getTaxes()
                );
            }


        }
    }
}

