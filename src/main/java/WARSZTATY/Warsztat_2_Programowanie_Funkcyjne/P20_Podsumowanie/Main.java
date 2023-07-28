package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P20_Podsumowanie;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("asdasdsad");
        stringSet.add("asdasdsad2");
        stringSet.add("asdasdsad3");
        stringSet.add("asdasdsad4");

        stringSet.stream().peek(s -> System.out.println("set: " + s)).collect(Collectors.toList());

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("asdasd1", 213);
        stringIntegerMap.put("asdasd2", 21323);
        stringIntegerMap.put("asdasd3", 21323);
        stringIntegerMap.put("asdasd4", 21453);

        stringIntegerMap.entrySet().stream().peek(s -> System.out.println("entrySet: " + s)).collect(Collectors.toList());
        
    }
}
