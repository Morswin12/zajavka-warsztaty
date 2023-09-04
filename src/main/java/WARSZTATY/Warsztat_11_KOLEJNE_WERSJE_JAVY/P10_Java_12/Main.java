package WARSZTATY.Warsztat_11_KOLEJNE_WERSJE_JAVY.P10_Java_12;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Pair collect = Stream.of(1, 42, 44, 1, 78, 4, 23, 22)
                .collect(Collectors.teeing(
                        Collectors.counting(),
                        Collectors.summingInt(element -> element),
                        Pair::new
                ));
        System.out.println(collect);

        Double result = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .collect(Collectors.teeing(
                        Collectors.counting(),
                        Collectors.summingDouble(el -> el),
                        (el1, el2) -> el2 / el1
                ));

        System.out.println(result);

    }



    @Data
    @ToString
    @AllArgsConstructor
    private static class Pair {
        Long count;
        Integer sum;

    }
}
