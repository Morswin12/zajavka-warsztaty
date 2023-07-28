package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P34_Zadania;

import java.util.Arrays;
import java.util.Comparator;

public class Zad2 {
    public static void main(String[] args) {
        String[] letters = {"z", "x", "a", "j", "a", "v", "x", "k", "a", "x"};
        String solution = Arrays.stream(letters)
                .map(String::toUpperCase)
                .filter(a -> !a.equals("X"))
                .sorted(Comparator.reverseOrder())
                .reduce(String::concat)
                .orElse("asdf");

        System.out.println(solution);
    }
}
