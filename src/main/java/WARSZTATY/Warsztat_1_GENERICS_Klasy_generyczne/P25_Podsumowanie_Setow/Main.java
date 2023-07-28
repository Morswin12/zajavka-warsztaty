package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P25_Podsumowanie_Setow;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Duck> duckSet = new LinkedHashSet<>();
        Duck donald1 = new Duck("Donald");
        Duck deisy = new Duck("Deisy");
        Duck donald2 = new Duck("Donald");

        duckSet.add(donald1);
        duckSet.add(deisy);
        duckSet.add(donald2);

        System.out.println(duckSet);

        deisy.setSurname("Donald");

        System.out.println(duckSet);
        System.out.println();

        Set<Duck> duckSet2 = new TreeSet<>((a, b) -> a.surname.compareTo(b.surname));
        Duck donalds1 = new Duck("Donald");
        Duck deisys = new Duck("Deisy");
        Duck donalds2 = new Duck("Donald");

        duckSet2.add(donalds1);
        duckSet2.add(deisys);
        duckSet2.add(donalds2);
        duckSet2.add(new Duck("Donalds"));
        duckSet2.add(new Duck("Arys"));


        System.out.println(duckSet2);

    }

    private static class Duck {
        private String surname;

        public Duck(String surname) {
            this.surname = surname;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public boolean equals(Object o) {
            System.out.println("Equals");
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Duck duck = (Duck) o;
            return surname.equals(duck.surname);
        }

        @Override
        public int hashCode() {
            System.out.println("Hash");
            return Objects.hash(surname);
        }

        @Override
        public String toString() {
            return "Duck{" +
                    "surname='" + surname + '\'' +
                    '}';
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }
    }


}
