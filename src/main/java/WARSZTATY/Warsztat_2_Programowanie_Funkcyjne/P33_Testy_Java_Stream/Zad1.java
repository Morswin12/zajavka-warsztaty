package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P33_Testy_Java_Stream;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Zad1 {
    public static void main(String[] args) {
//        List<String> collections = List.of("value", "kavka", "zajavka", "potrawka");
        Stream<String> collections = Stream.generate(() -> "avka");
        Predicate<String> somepredicate = a -> a.contains("avka");
        System.out.println("match1");
        boolean match1 = collections.anyMatch(somepredicate);
        System.out.println("match2");
//        boolean match2 = collections.allMatch(somepredicate);
//        System.out.println("match3");
//        boolean match3 = collections.noneMatch(somepredicate);
        System.out.println("match4");
//        System.out.println(" "+ match1 + match2 + match3);
    }
}
