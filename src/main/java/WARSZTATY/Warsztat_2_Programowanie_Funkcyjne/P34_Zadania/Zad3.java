package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P34_Zadania;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Zad3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 16, 18, 2, 5, 2, 6, 2, 1, 6, 1, 23, 64, 34);
        Set<Integer> collect = numbers.stream().collect(Collectors.toSet());
        Integer min = collect.stream()
                .sorted(Comparator.naturalOrder())
                .skip(1)
                .min(Comparator.naturalOrder())
                .orElse(0);

        System.out.println(min);

        Integer integer = numbers.stream()
                .sorted(Comparator.naturalOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Sexy madafaka"));

        System.out.println(integer);
    }
}
