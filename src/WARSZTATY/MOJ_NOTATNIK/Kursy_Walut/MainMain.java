package WARSZTATY.MOJ_NOTATNIK.Kursy_Walut;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainMain {
    public static void main(String[] args) {
        List<ZarobkiMiesieczne> roczne_zarobki = new ArrayList<>();
        roczne_zarobki.add(new ZarobkiMiesieczne(2023, 1).
                addPrzelew(new Nowy_Przelew(Platnik.BEZROBOTNY
                        , BigDecimal.valueOf(357_102.0)
                        , BigDecimal.valueOf(481_808.0)
                        , BigDecimal.valueOf(124_706.0)
                        , LocalDate.of(2023, 1, 5)))
                .addPrzelew(new Nowy_Przelew(Platnik.BEZROBOTNY
                        , BigDecimal.valueOf(346_678.0)
                        , BigDecimal.valueOf(458_751.0)
                        , BigDecimal.valueOf(112_073.0)
                        , LocalDate.of(2023, 1, 21)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2023, 3).
                addPrzelew(new Nowy_Przelew(Platnik.BEZROBOTNY
                        , BigDecimal.valueOf(342_818.0)
                        , BigDecimal.valueOf(452_159.0)
                        , BigDecimal.valueOf(109_341.0)
                        , LocalDate.of(2023, 3, 1)))
                .addPrzelew(new Nowy_Przelew(Platnik.BEZROBOTNY
                        , BigDecimal.valueOf(116_624.0)
                        , BigDecimal.valueOf(122_763.0)
                        , BigDecimal.valueOf(6_139.0)
                        , LocalDate.of(2023, 3, 31)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2023, 4).
                addPrzelew(new Nowy_Przelew(Platnik.JOHANNHELGI
                        , BigDecimal.valueOf(170_439.0)
                        , BigDecimal.valueOf(179_797.0)
                        , BigDecimal.valueOf(9_358.0)
                        , LocalDate.of(2023, 4, 29)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2023, 5).
                addPrzelew(new Nowy_Przelew(Platnik.JOHANNHELGI
                        , BigDecimal.valueOf(13_708.0)
                        , BigDecimal.valueOf(21_153.0)
                        , BigDecimal.valueOf(7_445.0)
                        , LocalDate.of(2023, 5, 2)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2023, 6).
                addPrzelew(new Nowy_Przelew(Platnik.RSK
                        , BigDecimal.valueOf(70_269.0)
                        , BigDecimal.valueOf(70_269.0)
                        , BigDecimal.valueOf(0.0)
                        , LocalDate.of(2023, 6, 1)))
                .addPrzelew(new Nowy_Przelew(Platnik.JOHANNHELGI
                        , BigDecimal.valueOf(666_769.0)
                        , BigDecimal.valueOf(1_005_279.0)
                        , BigDecimal.valueOf(338_510.0)
                        , LocalDate.of(2023, 6, 2)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2023, 7).
                addPrzelew(new Nowy_Przelew(Platnik.JOHANNHELGI
                        , BigDecimal.valueOf(696_076.0)
                        , BigDecimal.valueOf(1_055_318.0)
                        , BigDecimal.valueOf(359_242.0)
                        , LocalDate.of(2023, 7, 1)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2023, 8).
                addPrzelew(new Nowy_Przelew(Platnik.JOHANNHELGI
                        , BigDecimal.valueOf(532_120.0)
                        , BigDecimal.valueOf(775_377.0)
                        , BigDecimal.valueOf(243_257.0)
                        , LocalDate.of(2023, 8, 2)))
                .addPrzelew(new Nowy_Przelew(Platnik.BARAN
                        , BigDecimal.valueOf(58_958.0)
                        , BigDecimal.valueOf(58_958.0)
                        , BigDecimal.valueOf(0.0)
                        , LocalDate.of(2023, 8, 15)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2023, 9).
                addPrzelew(new Nowy_Przelew(Platnik.JOHANNHELGI
                        , BigDecimal.valueOf(555_929.0)
                        , BigDecimal.valueOf(816_029.0)
                        , BigDecimal.valueOf(260_100.0)
                        , LocalDate.of(2023, 9, 1)))
        );
        roczne_zarobki.add(new ZarobkiMiesieczne(2023, 9).
                addPrzelew(new Nowy_Przelew(Platnik.JOHANNHELGI
                        , BigDecimal.valueOf(555_929.0)
                        , BigDecimal.valueOf(816_029.0)
                        , BigDecimal.valueOf(260_100.0)
                        , LocalDate.of(2023, 9, 1)))
        );


        System.out.println(roczne_zarobki.get(0).getListaPrzelewow().get(0).getNrPrzelewu());
    }
}
