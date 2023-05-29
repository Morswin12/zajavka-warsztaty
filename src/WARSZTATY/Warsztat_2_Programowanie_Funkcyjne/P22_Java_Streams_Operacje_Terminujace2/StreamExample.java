package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P22_Java_Streams_Operacje_Terminujace2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> stringList = List.of("v15", "v12", "v13");

        //count
        // findFirst | findAny
        //min | max
        // allMatch | anyMatch | noneMatch
        // forEach

        // reduce

        Optional<String> reduce = stringList.stream().reduce((a, b) -> a + " " + b);
        System.out.println(reduce);

        String[] someAraay = new String[]{
                "z", "a", "j", "a", "v", "k", "a", " ", "n", "a", " ", "j", "a", "v", "k", "e"
        };

        Optional<String> reduce1 = Arrays.stream(someAraay)
                .reduce((a, b) -> a + b);
        System.out.println(reduce1);
        Optional<String> reduce2 = Stream.of(someAraay)
                .reduce((a, b) -> a + b);
        System.out.println(reduce2);

        String reduce3 = Stream.of(someAraay).reduce("To jest: ", (a, d) -> a + d);
        System.out.println(reduce3);

        String reduce4 = Stream.of(someAraay).reduce("To jest: ", (a, d) -> a + d, (a, b) -> a + " - " + b);
        System.out.println(reduce4);
        System.out.println();

        // collect
        System.out.println("   --------- collect -----------  ");

        Set<String> collect1 = Stream.of(someAraay)
                .collect(Collectors.toSet());

        System.out.println(collect1);
        System.out.println(collect1.getClass());

        Set<String> collect2 = Stream.of(someAraay)
                .collect(Collectors
                        .toCollection(()-> new TreeSet<>()));

        System.out.println(collect2);
        System.out.println(collect2.getClass());

        String collect3 = Stream.of(someAraay)
                .collect(Collectors.joining( "."));
        System.out.println(collect3);

        TreeSet<Object> collect4 = Stream.of(someAraay)
                .collect(
                        () -> new TreeSet<>(),
                        (existingSet, element) -> existingSet.add(element),
                        (a, b) -> a.add(b)
                );

        System.out.println("\nWłasny Collector: " + collect4);
        System.out.println(collect4.getClass());

        List<String> stringListcollect = Stream.of(someAraay)
                .collect(
                        ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll);

        System.out.println("Drugi własny Collector: " + stringListcollect);
        System.out.println(stringListcollect.getClass());
    }
}
