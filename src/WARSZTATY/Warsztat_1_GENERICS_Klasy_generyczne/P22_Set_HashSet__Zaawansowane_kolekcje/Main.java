package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P22_Set_HashSet__Zaawansowane_kolekcje;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(2);
        integerSet.add(1);
        System.out.println(integerSet);

        Set<Dog> dogSet = new HashSet<>();
        LocalTime localTime1 = LocalTime.now();

        for (int i = 0; i < 100000; i++) {
            dogSet.add(new Dog("dogggo" + i / 12));
        }
        LocalTime localTime2 = LocalTime.now();

        System.out.println(Duration.between(localTime1,LocalTime.now()).toMillis());
        long between = ChronoUnit.MILLIS.between(localTime1, localTime2);
        System.out.println(between);

        Dog dog1 = new Dog("Romek");
        Dog dog2 = new Dog("Stefan");
        Dog dog3 = new Dog("Romek");
        Dog dog4 = new Dog("Zbyczek");
        Dog dog5 = new Dog("Filip");
        Dog dog6 = new Dog("Romek");

        dogSet.add(dog1);
        dogSet.add(dog2);
        dogSet.add(dog3);
        dogSet.add(dog4);
        dogSet.add(dog5);
        dogSet.add(dog6);

//        System.out.println(dogSet);
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
            return Objects.hash(name);
//       return 1;
        }

    }

}
