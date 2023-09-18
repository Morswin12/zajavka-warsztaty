package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne;

import java.util.function.*;

public class MainTesty {
    public static void main(String[] args) {
        Function<String, Integer> asdf = String::length;

        Function<String, Integer> a2 = MainTesty::someMethod2;

//        BinaryOperator<String> a3 = s -> s.length();
//        UnaryOperator<String> a4 = s -> s.length();
        Consumer<String> a5 = String::length;
//        Supplier<String> a5 = s -> s.length();
        Function<String, Integer> a6 = String::length;

        MyCustomInterface<Integer, String, Integer, Boolean> lambda1 = (a, b, c) -> true;
//        MyCustomInterface<Boolean, Integer, Integer, Boolean> lambda2 = (a, b, c) -> a && b && c;
     }

    private static Integer someMethod2(String s) {
        return 1;
    }

    private static void someMethod1(String s1, Integer i1) {
        System.out.println(s1 + i1);
    }
}
