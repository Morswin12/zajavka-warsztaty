package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P11_Podsumowanie_FunctionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("Goro", 35);
        stringIntegerMap.forEach((a, b) -> System.out.println(a + "  orazz:    " + b));

        Optional<Integer> integer = Optional.of("Krowa")
                .map(s -> s.length());

        System.out.println(integer);
    }
}
