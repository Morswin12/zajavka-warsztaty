package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P31_Stream_Zaawansowane_Kolektory_cz_2;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> cities = List.of("Warszawa", "Warszawa", "Lublin", "Bieliny", "Zamość", "Wrocław", "Bieliny", "Poznań");

        //Colectors.
        // .toMap
        // .partitioningBy
        // .groupingBy

        // .toMap
        System.out.println("\n              .toMap        \n");

        var collect = cities.stream()
                .collect(Collectors.toMap(key -> key.length(), value -> value, (k1, k2) -> k1 + ", " + k2));
        System.out.println(collect);

        Map<String, List<Integer>> stringListMap = cities.stream()
                .collect(Collectors.toMap(
                        key -> key,                         // okreslamy klucz to nazwa miasta
                        value -> List.of(value.length()),   // Określamy wartosc, tu lista Intigerow określających dl. miast
                        (left, right) -> marge(left, right),               // tu okreslamy, w jaki sposób beda dodawać się wartości do listw w przypadku duplikacji klucza
                        TreeMap::new));                     // a tu okreslamy jaka rodzaj Mapy zostanie zaimplementowany
        System.out.println(stringListMap);


        // .partitioningBy
        System.out.println("\n              .partitioningBy          \n");

        Map<Boolean, List<String>> collect2 = cities.stream()
                .collect(Collectors.partitioningBy(city -> city.length() > 6));

        System.out.println(collect2);

        Map<Boolean, TreeSet<String>> collect3 = cities.stream()
                .collect(Collectors.partitioningBy(city -> city.length() > 6, Collectors.toCollection(TreeSet::new)));

        collect3.forEach((key, value) -> {
            System.out.println("Key: " + key + " value: " + value);
            System.out.println(value.getClass());
        });
//        System.out.println(collect3);


        // .groupingBy
        System.out.println("\n              .groupingBy          \n");

        var grupingBy = cities.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toCollection(TreeSet::new)));

        grupingBy.forEach((key, value) ->
                System.out.println("Key: " + key + " value: " + value)
        );
        System.out.println();

        var grupingBy2 = cities.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.joining(" + ", ">> ", " <<")));

        grupingBy2.forEach((key, value) ->
                System.out.println("Key: " + key + " value: " + value)
        );
        System.out.println();

        var grupingBy3 = cities.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.counting()));

        grupingBy3.forEach((key, value) ->
                System.out.println("Key: " + key + " value: " + value)
        );
        System.out.println();

        var grupingBy4 = cities.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(
                                (String s) -> s.toUpperCase(),
                                Collectors.maxBy(Comparator.naturalOrder()))
                        )
                );

        grupingBy4.forEach((key, value) ->
                System.out.println("Key: " + key + " value: " + value)
        );

        // .wlasny collect
        System.out.println("\n              .wlasny collect          \n");

        TreeSet<Object> collectOwn = cities.stream()
                .collect(() -> new TreeSet<>(), (a, b) -> a.add(b), (a, b) -> a.addAll(b));

        System.out.println(collectOwn);
    }

    private static <R> List<R> marge(List<R> left, List<R> right) {
        List<R> result = new ArrayList<>();
        result.addAll(left);
        result.addAll(right);
        return result;
    }
}
