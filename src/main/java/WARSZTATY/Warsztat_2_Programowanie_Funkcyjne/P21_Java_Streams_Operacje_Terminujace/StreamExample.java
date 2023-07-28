package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P21_Java_Streams_Operacje_Terminujace;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> stringList = List.of("v1", "v2", "v3");

        List<String> result =stringList.stream()
                .peek(s -> System.out.println("Value: " + s)).collect(Collectors.toList());

        System.out.println(result);
    }
}
