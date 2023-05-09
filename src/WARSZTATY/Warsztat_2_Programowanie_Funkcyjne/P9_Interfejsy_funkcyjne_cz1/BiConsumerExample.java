package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P9_Interfejsy_funkcyjne_cz1;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, Cat> biConsumer = BiConsumerExample::getPrintln;

        biConsumer.accept("Ja prdle ", new Cat("Mruczek"));
    }

    private static void getPrintln(String a, Cat b) {
        System.out.println(a + " " + b);
    }

    static class Cat {
        private final String name;

        Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat{" + name + " }";
        }
    }

}
