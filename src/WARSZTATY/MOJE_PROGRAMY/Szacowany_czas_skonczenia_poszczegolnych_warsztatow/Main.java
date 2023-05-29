package WARSZTATY.MOJE_PROGRAMY.Szacowany_czas_skonczenia_poszczegolnych_warsztatow;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Warsztat> warsztaty = Arrays.asList(
                new Warsztat("JAVA GENERICS I KOLEKCJE", 1, 40, new CzasTrwania(5), new CzasTrwania(6, 15), new CzasTrwania(7), new Progress(22)),
                new Warsztat("PROGRAMOWANIE FUNKCYJNE", 2, 37, new CzasTrwania(7, 15), new CzasTrwania(6, 30), new CzasTrwania(7, 15), new Progress(27)),
                new Warsztat("LOKALIZACJA I OPERACJE NA PLIKACH", 3, 38, new CzasTrwania(8, 45), new CzasTrwania(8, 30), new CzasTrwania(6), new Progress(33)),
                new Warsztat("PODSTAWOWE OPERACJE NA BAZACH DANYCH I JDBC", 4, 16, new CzasTrwania(5, 30), new CzasTrwania(0), new CzasTrwania(4, 45), new Progress(37)),
                new Warsztat("BUILDING TOOLS", 5, 21, new CzasTrwania(5, 30), new CzasTrwania(0), new CzasTrwania(0, 45), new Progress(39)),
                new Warsztat("JAK PISAC MNIEJ KODU? LOMBOK", 6, 7, new CzasTrwania(2), new CzasTrwania(0), new CzasTrwania(0, 45), new Progress(40)),
                new Warsztat("ZAPIS PRZEBIEGU DZIALANIA APLIKACJI - LOGOWANIE", 7, 12, new CzasTrwania(2, 45), new CzasTrwania(0), new CzasTrwania(0, 45), new Progress(41)),
                new Warsztat("TESTY JEDNOSTKOWE", 8, 15, new CzasTrwania(3, 45), new CzasTrwania(0), new CzasTrwania(2, 30), new Progress(44)),
                new Warsztat("DIAGRAM UML", 9, 11, new CzasTrwania(2, 15), new CzasTrwania(0), new CzasTrwania(0), new Progress(45)),
                new Warsztat("DESIGN PRINCIPLES I DESIGN PATTERNS", 10, 27, new CzasTrwania(9, 45), new CzasTrwania(0), new CzasTrwania(0), new Progress(48)),
                new Warsztat("KOLEJNE WERSJE JAVY", 11, 19, new CzasTrwania(6), new CzasTrwania(0), new CzasTrwania(3), new Progress(52)),
                new Warsztat("JAK ZAPISAC HISTORIE WPROWADZANYCH ZMIAN? GIT", 12, 36, new CzasTrwania(14), new CzasTrwania(0), new CzasTrwania(1), new Progress(58)),
                new Warsztat("SPRING BEANS", 13, 14, new CzasTrwania(4), new CzasTrwania(0), new CzasTrwania(0, 30), new Progress(59)),
                new Warsztat("MOCKING I SPRING", 14, 20, new CzasTrwania(4, 45), new CzasTrwania(0), new CzasTrwania(1, 30), new Progress(62)),
                new Warsztat("SPRING DATA ACCESS", 15, 14, new CzasTrwania(3, 45), new CzasTrwania(0), new CzasTrwania(5, 45), new Progress(65)),
                new Warsztat("ORM I HIBERNATE", 16, 40, new CzasTrwania(16), new CzasTrwania(0), new CzasTrwania(8), new Progress(74)),
                new Warsztat("SPRING DATA JPA", 17, 18, new CzasTrwania(6, 45), new CzasTrwania(0), new CzasTrwania(4, 15), new Progress(79)),
                new Warsztat("CONCURRENCY", 18, 1, new CzasTrwania(6), new CzasTrwania(0), new CzasTrwania(0), new Progress(81)),
                new Warsztat("SPRING WEB MVC", 19, 24, new CzasTrwania(9, 45), new CzasTrwania(0), new CzasTrwania(5, 15), new Progress(87)),
                new Warsztat("SPRING BOOT", 20, 20, new CzasTrwania(7, 30), new CzasTrwania(0), new CzasTrwania(1, 45), new Progress(90)),
                new Warsztat("SPRING REST", 21, 39, new CzasTrwania(11, 45), new CzasTrwania(0), new CzasTrwania(4), new Progress(96)),
                new Warsztat("HOW TO DEPLOY", 22, 2, new CzasTrwania(10), new CzasTrwania(0), new CzasTrwania(0), new Progress(100))
        );
        CzasTrwania sumaryczny_czas = new CzasTrwania(0, 0);
        for (Warsztat warsztat : warsztaty) {
            sumaryczny_czas = sumaryczny_czas.add(warsztat.getSumarycznyCzas());
            System.out.println(sumaryczny_czas);
        }
        System.out.println(sumaryczny_czas);


        System.out.println(warsztaty.get(0).getSumarycznyCzas());
        System.out.println(warsztaty.get(0).getSumarycznyCzas().getGodziny());
        System.out.println(warsztaty.get(0).getSumarycznyCzas().getMinuty());

        CzasTrwania sumaryczny_czas_do_11_warsztatu = new CzasTrwania(0, 0);
        for (int i = 0; i < 11; i++) {
            sumaryczny_czas_do_11_warsztatu = sumaryczny_czas_do_11_warsztatu.add(warsztaty.get(i).getSumarycznyCzas());
        }
        System.out.println();
        System.out.println("sumaryczny_czas_do_11_warsztatu: " + sumaryczny_czas_do_11_warsztatu);
        Long suma_minut = sumaryczny_czas_do_11_warsztatu.getGodziny() * 60 + sumaryczny_czas_do_11_warsztatu.getMinuty();
        System.out.println("suma_minut: " + suma_minut);
        Long ilosc_minut_na_dzien = suma_minut / 157;
        Long ilosc_minut_na_dzien_roboczy = suma_minut / 112;
        System.out.println("ilosc_minut_na_dzien_roboczy " + ilosc_minut_na_dzien_roboczy);
        System.out.println("ilosc_minut_na_dzien " + ilosc_minut_na_dzien);


        AktualnaData aktualnaData = new AktualnaData(5l);
        aktualnaData.printAmountOfMaterialsTime();
        System.out.println();

        AktualnaData aktualnaData2 = new AktualnaData(LocalDate.of(2023, 4, 30));
        aktualnaData2.printAmountOfMaterialsTime();
        AktualnaData aktualnaData3 = new AktualnaData(new CzasTrwania(39, 00));
        System.out.println();

        aktualnaData3.printAmountOfMaterialsTime();


        List<CzasFilmików> czasFilmikówList = new ArrayList<>();
        czasFilmikówList.add(new CzasFilmików(1, 22, 8));
        czasFilmikówList.add(new CzasFilmików(2, 6, 15));
        czasFilmikówList.add(new CzasFilmików(3, 11, 24));
        czasFilmikówList.add(new CzasFilmików(4, 6, 44));
        czasFilmikówList.add(new CzasFilmików(5, 61, 28));
        czasFilmikówList.add(new CzasFilmików(6, 10, 15));
        czasFilmikówList.add(new CzasFilmików(7, 6, 53));
        czasFilmikówList.add(new CzasFilmików(8, 7, 30));
        czasFilmikówList.add(new CzasFilmików(9, 6, 26));
        czasFilmikówList.add(new CzasFilmików(10, 44, 6));
        czasFilmikówList.add(new CzasFilmików(11, 0, 0));
        czasFilmikówList.add(new CzasFilmików(12, 102, 16));
        czasFilmikówList.add(new CzasFilmików(13, 6, 39));
        czasFilmikówList.add(new CzasFilmików(14, 23, 20));
        czasFilmikówList.add(new CzasFilmików(15, 9, 17));
        czasFilmikówList.add(new CzasFilmików(16, 63, 5));
        czasFilmikówList.add(new CzasFilmików(17, 0, 0));
        czasFilmikówList.add(new CzasFilmików(18, 48, 18));
        czasFilmikówList.add(new CzasFilmików(19, 7, 28));
        czasFilmikówList.add(new CzasFilmików(20, 20, 30));
        czasFilmikówList.add(new CzasFilmików(21, 40, 57));
        czasFilmikówList.add(new CzasFilmików(22, 19, 7));
        czasFilmikówList.add(new CzasFilmików(23, 5, 7));
        czasFilmikówList.add(new CzasFilmików(24, 17, 29));
        czasFilmikówList.add(new CzasFilmików(25, 39, 42));
        czasFilmikówList.add(new CzasFilmików(26, 36, 23));
        czasFilmikówList.add(new CzasFilmików(27, 3, 18));

        CzasFilmików czasFilmikówDo = new CzasFilmików(0, 0, 0);
        for (CzasFilmików czasFilmików : czasFilmikówList) {
            czasFilmikówDo.setMinuty(czasFilmikówDo.getMinuty() + czasFilmików.getMinuty());
            czasFilmikówDo.setSekundy(czasFilmikówDo.getSekundy() + czasFilmików.getSekundy());
        }
        int minuty = czasFilmikówDo.getMinuty() + (czasFilmikówDo.getSekundy() / 60);
        System.out.println("Minut do filmu26: " + minuty);
        System.out.println("Godzin: " + minuty / 60 + ":" + minuty % 60);

        AktualnaData aktualnaData4 = new AktualnaData(new CzasTrwania(77, 00));
        System.out.println();
    }
}
