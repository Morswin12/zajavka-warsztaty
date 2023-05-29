package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P27_Java_stream_Po_Co_Te_Streamy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(List.of("Warszawa", "Gdańsk", "Łódź", "Wrocław", "Gdańsk", "Łódź"));
        System.out.println(cities);

        // 1
        List<Integer> longsList = new ArrayList<>();
        for (String city : cities) {
            longsList.add(city.length());
        }
        System.out.println("Step1: " + longsList);

        // 2
        Collections.sort(cities);
        Collections.sort(longsList, Comparator.<Integer, Integer>comparing(s -> s).reversed());
//        System.out.println("Step2: " + cities);
        System.out.println("Step2: " + longsList);

        // 3
        List<Integer> integerList = new ArrayList<>();
        for (Integer integer : longsList) {
            if (integer > 5) {

                integerList.add(integer);
            }
        }
        System.out.println("Step3: " + integerList);

        // 4
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < integerList.size()-1 ; i++) {
            result.add(integerList.get(i));
        }
        System.out.println("Step4: " +result);

        System.out.println();
        List<Integer> collect = cities.stream()
                .map(String::length)
                .peek(s -> System.out.println("Step1: " + s))
                .sorted(Comparator.<Integer, Integer>comparing(s -> s).reversed())
                .peek(s -> System.out.println("Step2: " + s))
                .filter(s -> s > 5)
                .peek(s -> System.out.println("Step3: " + s))
                .skip(1)
                .limit(2)
                .peek(s -> System.out.println("Step4: " + s))
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
