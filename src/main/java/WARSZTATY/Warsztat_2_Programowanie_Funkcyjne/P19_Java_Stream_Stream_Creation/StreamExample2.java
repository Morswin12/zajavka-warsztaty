package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P19_Java_Stream_Stream_Creation;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        Stream<String> stringStream = Stream.of("1", "7", "10")
                .peek(elem -> System.out.println("elem: " + elem));

//        Stream.generate(() -> Math.random()).peek(s -> System.out.println("elem: " + s)).collect(Collectors.toList());

        Stream.iterate(0, previous -> previous + 1).peek(s-> System.out.println(s)).collect(Collectors.toList());
      }
}
