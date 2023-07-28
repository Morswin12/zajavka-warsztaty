package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P27_Java_stream_Po_Co_Te_Streamy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(List.of("Warszawa", "Gdańsk", "Łódź", "Wrocław", "Szecin", "Zakopane"));

        List<String> result = cities.stream()
                .peek(elem -> System.out.println("Step1: " + elem))
                .filter(element -> element.length() > 5)
                .peek(elem -> System.out.println("Step2: " + elem))
                .sorted(Comparator.<String>naturalOrder().reversed())
                .peek(elem -> System.out.println("Step3: " + elem))
                .skip(1)
                .peek(elem -> System.out.println("Step4: " + elem))
                .limit(2)
                .peek(elem -> System.out.println("Step5: " + elem))
                .collect(Collectors.toList());

        System.out.println("Result: " + result);
    }
}
