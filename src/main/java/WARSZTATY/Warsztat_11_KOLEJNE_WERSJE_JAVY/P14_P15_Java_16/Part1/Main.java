package WARSZTATY.Warsztat_11_KOLEJNE_WERSJE_JAVY.P14_P15_Java_16.Part1;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Records
        Person person1 = new Person("Paweł", "Goro", 333L, 34);
        Name person2 = new Person("Pawel", "Goro", 333L, "44");
        Person<Long> person3 = new Person("Pawel", "Goro", 333L, 44L);
        Person<Function<String, Integer>> person4 = new Person<>("Pawel", "Goro",  333L, String::length);
        String surname = person1.surname();
        System.out.println(surname);
        System.out.println(person1);

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
