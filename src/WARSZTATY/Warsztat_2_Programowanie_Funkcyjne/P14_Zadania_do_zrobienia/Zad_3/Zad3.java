package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P14_Zadania_do_zrobienia.Zad_3;

import WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P13_Podsumowanie_i_testy.MyCustomException;

import java.util.Optional;
import java.util.function.BinaryOperator;

public class Zad3 {
    public static void main(String[] args) {
        BinaryOperator<Gucio> binaryOperator = Zad3::compareSomeObject;

        Gucio wiekszyGucio = binaryOperator
                .apply(new Gucio("Goro mistr", 35), new Gucio("Oskar zajebisty", 35));
        Optional<Gucio> wiekszyGucio1 = Optional.ofNullable(Optional.ofNullable(wiekszyGucio).orElseThrow(
                () -> {
                    throw new MyCustomException("Nullowate  ");
                }));
        System.out.println(wiekszyGucio1);
    }

    private static <T extends Comparable> T compareSomeObject(T o1, T o2) {
        T gucio = null;

        if (o1.compareTo(o2) == 0) {
        }
        else if (o1.compareTo(o2) > 0) {
            gucio = o1;
        } else {
            gucio = o2;
        }
        return gucio;
    }

    static class Gucio implements Comparable<Gucio> {
        private final String name;
        private final int age;

        public Gucio(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Gucio{" + name + ", age=" + age + '}';
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public int compareTo(Gucio o) {
            return this.age - o.age;
        }
    }

}
