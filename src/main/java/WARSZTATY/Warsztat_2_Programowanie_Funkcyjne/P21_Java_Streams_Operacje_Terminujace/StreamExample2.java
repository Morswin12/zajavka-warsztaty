package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P21_Java_Streams_Operacje_Terminujace;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {
        List<String> stringList = List.of("v15", "v12", "v13");

        //count

//        System.out.println((long) stringList.size());
        System.out.println(stringList.stream()
                .count());
        System.out.println();

        // findFirst | findAny

        Optional<String> firstEl = stringList.stream().findFirst();
        System.out.println("findFirst:  " + firstEl);

        Optional<Object> firstElEmpty = Stream.empty().findFirst();
        System.out.println("findFirst:  " + firstElEmpty);

        Optional<String> anyEl = stringList.stream().findAny();
        System.out.println("findAny: " + anyEl);
        System.out.println();


        //min | max

        Optional<String> min = stringList.stream().min((a, b) -> a.compareTo(b));
        System.out.println("min: " + min);
        Optional<String> max = stringList.stream().max((a, b) -> a.compareTo(b));
        System.out.println("max: " + max);
        System.out.println();

        // allMatch | anyMatch | noneMatch
        System.out.println("allMatch | anyMatch | noneMatch");

        System.out.println("\n " + stringList);
        System.out.println("all contains(5): " +stringList.stream().allMatch(s -> {
            System.out.println(s);
            return s.contains("5");
        }));
        System.out.println("any contains(5): " +stringList.stream().anyMatch(s -> {
            System.out.println(s);
            return s.contains("3");
        }));
        System.out.println("none contains(5): " +stringList.stream().noneMatch((s -> {
            System.out.println(s);
            return s.contains("5");
        })));
        System.out.println();

        // forEach
        System.out.println("forEach ");

        List<String> newList = new ArrayList<>();

        stringList.stream().forEach(s-> {
            newList.add(s + " goro ");
            System.out.println(s);
        });
        System.out.println(newList);
    }
}
