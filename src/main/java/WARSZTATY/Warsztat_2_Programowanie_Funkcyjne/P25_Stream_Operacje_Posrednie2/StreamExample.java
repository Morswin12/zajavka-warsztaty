package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P25_Stream_Operacje_Posrednie2;

import WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P24_Stream_Operacje_Posrednie.City;
import WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P24_Stream_Operacje_Posrednie.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        //peek
        System.out.println("----------------peek-----------------");

        List<Person> people = Arrays.asList(
                new Person("Piotr", new City("Warszawa")),
                new Person("Adam", new City("Kraków")),
                new Person("łukasz", new City("Kielce")),
                new Person("Karol", new City("Kielceo")),
                new Person("Michał", new City("Wrocław")),
                new Person("Darek", new City("Masłów")),
                new Person("Adam", new City("Masłów")));

        List<Integer> collect = people.stream()
                .peek(x -> System.out.println("Step1: " + x))
                .map(Person::getCity)
                .peek(x1 -> System.out.println("Step2: " + x1))
                .map(City::getName)
                .peek(x2 -> System.out.println("Step3: " + x2))
                .map(String::length)
                .peek(x3 -> System.out.println("Step4: " + x3))
                .collect(Collectors.toList());

        System.out.println(collect);
        System.out.println();

        //distinct
        System.out.println("----------------distinct-----------------");

        List<String> cities = Arrays.asList(
                "Warszawa", "Kraków", "Łódź","Ącice", "Kielce", "Kielce", "Wrocław", "Masłów", "BielskoBiaa"
        );

        String collect1 = cities.stream()
                .distinct()
                .collect(Collectors.joining(", "));

        System.out.println(collect1);
        System.out.println();

        //limit
        System.out.println("----------------limit-----------------");

        List<String> collect2 = cities.stream()
                .limit(3)
                .map(a -> a + " juhu")
                .peek(s -> System.out.println(s))
                .map(a -> a.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(collect2);

        AtomicInteger counter = new AtomicInteger(0);
        List<String> collect3 = Stream.generate(() -> "Some String " + counter.incrementAndGet())
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(collect3);

        //skip
        System.out.println("----------------skip-----------------");

        List<String> citiesSkip = Arrays.asList(
                "Warszawa", "Kraków", "Kielce", "Kielce", "Kielce", "Wrocław", "Masłów", "Bielsko"
        );

        List<Integer> collect4 = people.stream()
                .peek(x -> System.out.println("Step1: " + x.getName()))
                .map(Person::getCity)
                .peek(x1 -> System.out.println("Step2: " + x1.getName()))
                .map(City::getName)
                .skip(3)
                .peek(x2 -> System.out.println("Step3: " + x2))
                .map(String::length)
                .peek(x3 -> System.out.println("Step4: " + x3))
                .collect(Collectors.toList());
        System.out.println(collect4);
        System.out.println();

        Stream<String> citiesSkip2 = Stream.iterate("Start: ", (elem) -> elem + "; ");
        citiesSkip2
                .peek(x -> System.out.println("Step1: " + x))
                .map(String::toUpperCase)
                .limit(12)
                .peek(x1 -> System.out.println("Step2: " + x1))
                .map(String::toLowerCase)
                .skip(3)
                .peek(x2 -> System.out.println("Step3: " + x2))
                .map(String::length)
                .peek(x3 -> System.out.println("Step4: " + x3))
                .collect(Collectors.toList());

        System.out.println("\n");

        //skip
        System.out.println("----------------skip-----------------");

        System.out.println();
        List<Integer> collect5 = cities.stream()
                .peek(x -> System.out.println("Step1: " + x))
                .sorted()
                .peek(x1 -> System.out.println("Step2: " + x1))
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(collect5);


        people.stream()
                .peek(d -> System.out.println("Step1: " + d))
                .sorted(Comparator.comparing(Person::getName))
                .peek(d -> System.out.println("Step2: " + d))
                .collect(Collectors.toList());

    }
}
