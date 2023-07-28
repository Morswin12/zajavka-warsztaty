package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P15_COMPARABLE__Porownywanie_obiektow;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleClass {
    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(
                new Dog("Azor", 3),
                new Dog("Kamel", 8),
                new Dog("Kedzior", 2),
                new Dog("Czesio", 6),
                new Dog("Wasyl", 5),
                new Dog("Wasyl", 7),
                new Dog("Wasyl", 1),
                new Dog("Pimpek", 4)
        );
        System.out.println(dogs);
        Collections.sort(dogs);
        System.out.println(dogs);
    }
}
