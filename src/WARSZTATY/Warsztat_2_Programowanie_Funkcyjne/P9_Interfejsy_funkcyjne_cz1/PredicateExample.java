package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P9_Interfejsy_funkcyjne_cz1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Kraków");
        cities.add("Pcin");
        cities.add("Piaseczno");
        cities.add("Rowerowki");
        cities.add("Porąbki");

        printSomeCities(cities, PredicateExample::isContains);
        System.out.println();
        printSomeCities(cities, s -> s.length()>6);
    }

    private static boolean isContains(String s) {
        return s.contains("P");
    }

    private static void printSomeCities(final List<String> cities, Predicate<String> checker) {
        for (String city : cities) {
            if (checker.test(city)) {
                System.out.println(city);
            }
        }
    }
}
