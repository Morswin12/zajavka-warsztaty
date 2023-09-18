package WARSZTATY.Warsztat_11_KOLEJNE_WERSJE_JAVY.P14_P15_Java_16.Part2;

import java.util.List;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {

        List<String> collect = Stream.of(1, 5, 22, 45, 71, 34)
                .map(Object::toString)
//                .collect(Collectors.toList());
                .toList();  // możemy użyć skruconego zapisu od Java 16 zamiast całego jak wyżyj
    }
}
