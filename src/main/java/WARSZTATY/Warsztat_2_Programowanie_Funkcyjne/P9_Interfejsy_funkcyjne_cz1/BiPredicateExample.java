package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P9_Interfejsy_funkcyjne_cz1;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = BiPredicateExample::isaBoolean;
        System.out.println(biPredicate.test("asdas", 4));
        System.out.println(biPredicate.test("asdas", 7));
    }

    private static boolean isaBoolean(String a, Integer b) {
        System.out.println("is " + a + " length bigger than "+ b);
        return a.length() > b;
    }
}
