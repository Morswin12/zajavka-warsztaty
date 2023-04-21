package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P32_Podsumowanie_kolejek;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> stringDeque = new ArrayDeque<>();
        System.out.println(stringDeque);
        for (int i = 0; i < 10; i++) {
            stringDeque.offer("asdf" +i);
            System.out.println(stringDeque);
        }
    }
}
