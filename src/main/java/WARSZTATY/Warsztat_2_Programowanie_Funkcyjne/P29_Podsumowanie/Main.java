package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P29_Podsumowanie;

import java.util.OptionalDouble;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stringStream = Stream.of(2, 4, 7, 9);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Integer sum = stringStream
                .peek(elem-> atomicInteger.incrementAndGet())
                .reduce(0, (elem1, elem2) -> elem1 + elem2);

        System.out.println(sum);
        System.out.println(atomicInteger);
        int i = atomicInteger.get();
        double average = (double) sum / i;
        System.out.println(average);


        Stream<Integer> stringStream2 = Stream.of(2, 4, 7, 9);

        OptionalDouble average1 = stringStream2.mapToInt(value -> value).average();
        System.out.println(average1.orElse(0));
    }
}
