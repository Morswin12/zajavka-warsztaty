package WARSZTATY.MOJE_PROGRAMY.Szacowany_czas_skonczenia_poszczegolnych_warsztatow;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

public class Main_Part2 {
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

        long count = warsztaty.stream()
                .filter(w -> w.getNumer() > 11)
                .count();
        CzasTrwania sumarycznyCzasTrwaniaWarsztatowOd12Do22Karola = new CzasTrwania(0L);

        List<Warsztat> warsztats = warsztaty.stream().filter(w -> w.getNumer() > 11).toList();
        for (Warsztat warsztat : warsztats) {
            sumarycznyCzasTrwaniaWarsztatowOd12Do22Karola = sumarycznyCzasTrwaniaWarsztatowOd12Do22Karola.add(warsztat.getCzasTrwania_FilmowKarola());
        }
        long between = ChronoUnit.DAYS.between(LocalDate.of(2023, 9, 18), LocalDate.of(2023, 12, 15));
        System.out.println("days: " + between);


        long IloscMinutNaDzien = (sumarycznyCzasTrwaniaWarsztatowOd12Do22Karola.getGodziny() * 60 + sumarycznyCzasTrwaniaWarsztatowOd12Do22Karola.getMinuty()) / between;
        System.out.println(IloscMinutNaDzien);
        CzasTrwania czasTrwania = new CzasTrwania(0);
        CzasTrwania czasTrwania1 = czasTrwania.add(new CzasTrwania(0, IloscMinutNaDzien));

        System.out.println("Tyle filmów dziennie trzeba zrobić, aby się wyrobić: " + czasTrwania1);

        System.out.println("Ilość warsztatów: " + count);
        System.out.println("sumaryczny Czas Trwania Warsztatów Od 12 Do 22 Warsztatu: " + sumarycznyCzasTrwaniaWarsztatowOd12Do22Karola);
    }
}
