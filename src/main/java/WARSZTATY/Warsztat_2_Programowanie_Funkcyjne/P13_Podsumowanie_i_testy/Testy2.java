package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P13_Podsumowanie_i_testy;

import java.util.function.*;

public class Testy2 {
    public static void main(String[] args) {
quiz1();
    }

    private static void quiz1() {
//        BinaryOperator<String> functionalInterface1 = s -> s.length();
//        UnaryOperator<String> functionalInterface2 = s -> s.length();
        Function<String, Integer> functionalInterface3 = s -> s.length();
        Consumer<String> functionalInterface4 = s -> s.length();
//        Supplier<String> functionalInterface5 = s -> s.length();
    }
    private static void quiz2() {
//        BinaryOperator<String> functionalInterface1 = String::length;
//        UnaryOperator<String> functionalInterface2 = String::length;
        Function<String, Integer> functionalInterface3 = String::length;
        Consumer<String> functionalInterface4 = String::length;
//        Supplier<String> functionalInterface5 = String::length;
    }
}
