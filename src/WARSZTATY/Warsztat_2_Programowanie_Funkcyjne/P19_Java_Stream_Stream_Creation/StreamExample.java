package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P19_Java_Stream_Stream_Creation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        Stream<String> stringStream = Stream.of("1", "7", "10")
                .peek(elem -> System.out.println("elem: " + elem));

        stringStream.collect(Collectors.toList());

        System.out.println(" ----------------------------");

        List<String> stringList = List.of("1", "7", "10", "12", "57", "20");

        Stream<String> stream1 = stringList.stream().peek(s-> System.out.println("element: " + s));
        Stream<String> stream2 = stringList.stream().peek(s-> System.out.println("el. " + s+ " ma dugosc równą : " + s.length()));

        stream1.collect(Collectors.toList());
        stream2.collect(Collectors.toList());

        Stream<String> stream3 = stringList.stream().peek(s-> System.out.println("element: " + s));
        stream3.collect(Collectors.toList()).stream().collect(Collectors.toList()).stream().collect(Collectors.toList());
    }
}
