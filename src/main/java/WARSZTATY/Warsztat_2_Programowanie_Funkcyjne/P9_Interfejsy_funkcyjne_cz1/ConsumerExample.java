package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P9_Interfejsy_funkcyjne_cz1;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = ConsumerExample::extracted;
        consumer.accept("Wydrukuj mnie");

    }

    private static void extracted(String c) {
        System.out.println("Calling consumer");
        System.out.println(c);
    }
}
