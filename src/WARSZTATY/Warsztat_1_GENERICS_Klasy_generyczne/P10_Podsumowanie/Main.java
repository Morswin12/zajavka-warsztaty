package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P10_Podsumowanie;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("asdf", "super", "hiper");
        List<Animal> animalList = Arrays.asList(new Dog(), new Animal(), new Dog());
        List<Dog> dogsList = Arrays.asList(new Dog(), new Dog(), new Dog());
        List<Dog.Pigeon> pigeonsList = Arrays.asList(new Dog.Pigeon(), new Dog.Pigeon(), new Dog.Pigeon());

        List<? extends Animal> allList = pigeonsList;
//        allList.add(new Animal());
//        allList.add(new Dog.Pigeon());

        print(stringList);
        print(animalList);
        print2(animalList);
        print2(dogsList);
        print2(pigeonsList);
    }

    private static void print2(List<? extends Animal> animalList) {
        for (Animal animal : animalList) {
            System.out.println(animal);
        }
    }

    private static void print(List<?> stringList) {
        for (Object o : stringList) {
            System.out.println(o);
        }
    }

    static class Animal {
        @Override
        public String toString() {
            return "Animal{}";
        }
    }

    static class Dog extends Animal {
        @Override
        public String toString() {
            return "Dog{}";
        }

        static class Pigeon extends Animal {
            @Override
            public String toString() {
                return "Pigeon{}";
            }
        }
    }
}