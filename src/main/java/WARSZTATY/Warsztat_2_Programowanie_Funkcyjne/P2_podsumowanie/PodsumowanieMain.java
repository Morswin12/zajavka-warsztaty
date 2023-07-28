package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P2_podsumowanie;

import WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P2_podsumowanie.ZAD1.SomeFunctionalInterface;

public class PodsumowanieMain {
    public static void main(String[] args) {
        SomeFunctionalInterface someFunctionalInterface = a -> a.length();
        System.out.println(someFunctionalInterface.stringSize("Krowa bura"));


        someMethod("Ponury misiek", d-> d.length());
    }

    public static void someMethod(String s, SomeFunctionalInterface test) {
        System.out.println(test.stringSize(s));
    }
}
