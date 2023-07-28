package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P14_Zadania_do_zrobienia.Zad_1;

import java.util.function.BiFunction;

public class Zad1 {
    public static void main(String[] args) {
        BiFunction<Integer, Double, String> biFunction = Zad1::madeStringSum;
        String apply = biFunction.apply(234, 323.3232);
        System.out.println("Sum of is: " + apply);
    }

    private static String madeStringSum(Integer i, Double d) {
        System.out.println("Integer: " + i + ", double: " + d);
        return i + d + "";
    }
}
