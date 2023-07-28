package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P4_No_Generic;

import java.util.ArrayList;
import java.util.List;

public class NoGenericMain {
    public static void main(String[] args) {
        List dogs = new ArrayList<>();
        dogs.add(new Dog());
//        dogs.add(new Cat());

        print(dogs);

        List<Dog> dogList = new ArrayList<>();
        addDog(dogList);
        System.out.println(dogList);

//        Dog dog = dogList.get(0);
//        System.out.println(dog);

        List ints = new ArrayList<>();
        ints.add(15);
        int o = (Integer) ints.get(0);
        System.out.println(o);
    }

    private static void addDog(List dogList) {
        dogList.add(new Cat());
    }

    public static void print(List<Dog> list) {
        for (Dog dog : list) {
            System.out.println(dog);
        }
    }

    public static class Dog {
    }

    public static class Cat {
    }
}

