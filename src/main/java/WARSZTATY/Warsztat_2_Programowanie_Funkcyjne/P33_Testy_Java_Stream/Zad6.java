package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P33_Testy_Java_Stream;

import java.util.Arrays;
import java.util.List;

public class Zad6 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Szczecin", "Zakopane", "Gdynia");
        String result = cities.stream()
                .reduce("Cities: ", (left, right) -> right);
        System.out.println(result);

    }
}
