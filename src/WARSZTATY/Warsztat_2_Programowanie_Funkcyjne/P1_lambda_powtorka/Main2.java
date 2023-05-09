package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P1_lambda_powtorka;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> cities = List.of("Kielce", "Warszawa", "Wrocław", "Kraków");

        printCitiesif(cities, a -> a.contains("K"));
        printCitiesif(cities, a -> {
            System.out.println("lambda: czy "+ a + "zawiera \"W\" ");
            return a.contains("W");
        });
    }

    public static void printCitiesif(List<String> list, Checable2 checker) {
        for (String s : list) {
            if (checker.filtrCities(s)) {
                System.out.println("printing: " + s);
            }
        }
    }
}
