package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P34_Zadania;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Zad4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 16, 18, 2, 5, 2, 6, 2, 1, 6, 1, 23, 64, 34);

        Integer integer = numbers.stream()
                .sorted(Comparator.<Integer>naturalOrder().reversed())
                .distinct()
                .skip(1)
                .max(Comparator.naturalOrder())
                .orElse(100000);

        System.out.println(integer );
    }
}
