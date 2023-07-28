package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P23_Set_LinkedHashSet__Zaawansowane_kolekcje;

import WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P22_Set_HashSet__Zaawansowane_kolekcje.Main;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        Set<Dog> dogSet = new LinkedHashSet<>();
        LocalTime localTime1 = LocalTime.now();

        for (int i = 0; i < 100000; i++) {
            dogSet.add(new Dog("dogggo" + i / 12));
        }
        LocalTime localTime2 = LocalTime.now();

        System.out.println(Duration.between(localTime1,LocalTime.now()).toMillis());

        Dog dog1 = new Dog("Romek1");
        Dog dog2 = new Dog("Romek2");
        Dog dog3 = new Dog("Romek3");
        Dog dog4 = new Dog("Romek4");
        Dog dog5 = new Dog("Romek5");
        Dog dog6 = new Dog("Romek6");
        Dog dog7 = new Dog("Romek6");
        Dog dog8 = new Dog("Romek6");

        dogSet.add(dog1);
        dogSet.add(dog2);
        dogSet.add(dog3);
        dogSet.add(dog4);
        dogSet.add(dog5);
        dogSet.add(dog6);
        dogSet.add(dog6);
        dogSet.add(dog6);

        for (Dog dog : dogSet) {
//            System.out.println(dog);
        }
    }

    private static class Dog {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "D: " + name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dog dog = (Dog) o;
            return name.equals(dog.name);
        }

        @Override
        public int hashCode() {
//            return Objects.hash(name);
       return 1;
        }

    }

}
