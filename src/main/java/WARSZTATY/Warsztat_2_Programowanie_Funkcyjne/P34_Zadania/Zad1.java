package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P34_Zadania;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Zad1 {
    public static void main(String[] args) {
        Integer integer = 5;
        List<Integer> collect = Stream.of(integer).map(Zad1::silnia).collect(Collectors.toList());
        System.out.println(collect);

        Integer silnia = calculateFactorial(5);

        System.out.println(silnia);
    }

    private static Integer calculateFactorial(int i) {
        OptionalInt reduce = IntStream.rangeClosed(1, i).reduce((a, b) -> a * b);
        return reduce.orElse(0);

    }

    private static Integer silnia(Integer b) {
        Integer result = 1;
        for (int i = 2; i <= b ; i++) {
            result *= i;
        }
        return result;
    }
}
