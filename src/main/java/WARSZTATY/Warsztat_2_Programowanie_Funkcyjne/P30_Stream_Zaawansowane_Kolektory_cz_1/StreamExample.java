package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P30_Stream_Zaawansowane_Kolektory_cz_1;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(List.of("Warszawa", "Lublin", "Zamość", "Wrocław", "Bieliny", "Poznań"));

        //Colectors.
        // .counting
        // .joining
        // .toCollections
        // .maxBy  .minBy
        // .mapping

        System.out.println("\n              .counting        \n");

        long count = cities.stream().count();
        System.out.println(count);

        long count2 = cities.stream().collect(Collectors.counting());
        System.out.println(count2);

        // .joining
        System.out.println("\n              .joining        \n");
        String collect = cities.stream()
                .filter(value -> value.length() > 6)
//                .collect(Collectors.joining());
//                .collect(Collectors.joining("<-->"));
                .collect(Collectors.joining("<-->", "start ", " end"));
        System.out.println(collect);

        // .toCollections
        System.out.println("\n              .toCollections        \n");

        var collect1 = cities.stream()
                .filter(value -> value.length() > 6)
//                .collect(Collectors.toSet());
//                .collect(Collectors.toList());
//                .collect(Collectors.toCollection(() -> new ArrayList<>()));
//                .collect(Collectors.toCollection(() -> new TreeSet<>()));
//                .collect(Collectors.toCollection(LinkedList::new));
                .collect(Collectors.toCollection(() -> new LinkedHashSet<>()));
        System.out.println(collect1.getClass());

        // .maxBy  .minBy
        System.out.println("\n              .maxBy  .minBy        \n");

        Optional<String> collect2 = cities.stream()
//                .max(Comparator.naturalOrder());
                .collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println("Max normal: " + collect2);

        Optional<String> collect3 = cities.stream()
//                .max(Comparator.<String>naturalOrder().reversed());
                .collect(Collectors.maxBy(Comparator.<String>naturalOrder().reversed()));
        System.out.println("Max odwrot: " +collect3);

//        Optional<String> collect4 = cities.stream().min(Comparator.naturalOrder());
        Optional<String> collect4 = cities.stream()
                .collect(Collectors.minBy(Comparator.naturalOrder()));
        System.out.println("Min normal: " +collect4);

        Optional<String> collect5 = cities.stream()
//                .min(Comparator.<String>naturalOrder().reversed());
                .collect(Collectors.minBy(Comparator.<String>naturalOrder().reversed()));
        System.out.println("Min odwrot: " +collect5);


        // .mapping
        System.out.println("\n              .mapping        \n");

        Integer reduce = cities.stream()
                .map(city -> city.length())
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduce);

        Integer collect6 = cities.stream()
//                .map(String::length).reduce(0, Integer::sum);
                .collect(Collectors.mapping(city -> city.length(), Collectors.reducing(0, (a, b) -> a + b)));
        System.out.println(collect6);
    }
}
