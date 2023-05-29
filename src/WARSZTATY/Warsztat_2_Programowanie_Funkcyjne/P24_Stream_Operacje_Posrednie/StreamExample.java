package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P24_Stream_Operacje_Posrednie;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        //filter
        System.out.println("--------------filter-----------------\n");

        List<String> cities = Arrays.asList(
                "Warszawa", "Kraków", "Kielce", "Kielceo", "Wrocław", "Masłów", "BielskoBiaa"
        );
        Stream<String> stream = cities.stream();
        List<String> filteredList = stream
                .filter(s -> s.contains("a") || s.contains("o"))
                .filter(s -> s.length() > 6)
                .collect(Collectors.toList());
        System.out.println(filteredList);
        System.out.println();

        //map
        System.out.println("--------------map-------------");

        List<String> collect = cities.stream()
                .map(s -> s + "-" + s.length())
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(collect);

        List<Person> cities2 = Arrays.asList(
                new Person("Adam", new City("Warszawa")),
                new Person("Adam", new City("Kraków")),
                new Person("Adam", new City("Kielce")),
                new Person("Adam", new City("Kielceo")),
                new Person("Adam", new City("Wrocław")),
                new Person("Adam", new City("Masłów")),
                new Person("Adam", new City("Masłów")));

        List<City> collect1 = cities2.stream()
                .map(Person::getCity)
                .collect(Collectors.toList());
        System.out.println(collect1);

        AtomicInteger counter = new AtomicInteger(0);
        String reduce = cities2.stream()
                .map(Person::getCity)
                .map(city -> counter.incrementAndGet() + " " + city.getName())
                .reduce("Start: ", (a, b) -> a + " " + b);
        System.out.println(reduce);


        System.out.println();

        //flatMap
        System.out.println("------------------flatMap---------------------");

        List<String> cities3 = Arrays.asList(
                "Warszawa", "Kraków3", "Kielce", "Kielceo3", "Wrocław", "Masłów", "BielskoBiaa"
        );
        List<String> cities4 = Arrays.asList(
                "Warszawa4",  "Kielce", "Kielceo4","Kraków", "Wrocław4", "Masłów", "BielskoBiaa"
        );
        List<String> cities5 = Arrays.asList(
                "Warszawa", "Kraków", "Kielce5", "Kielceo", "Wrocław", "Masłów5", "BielskoBiaa5"
        );

        List<List<String>> lostOfCitiesLists = List.of(cities3, cities4, cities5);
        System.out.println(lostOfCitiesLists);

        Stream<String> stringStream = lostOfCitiesLists.stream()
                .flatMap(citie -> citie.stream().map(String::toUpperCase));
        System.out.println(stringStream.collect(Collectors.toSet()));

    }
}
