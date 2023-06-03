package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P28_Stream_vs_Typy_Prymitywne;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> numbersInt = List.of(1, 2, 3, 4, 5, 6);
        List<Double> numbersDouble = List.of(1.3, 2.2, 3.1, 4.2, 5.2, 6.2);
        List<Long> numbersLong = List.of(1L, 2L, 3L, 4L, 5L, 6L);

        Integer reduce = numbersInt.stream()
                .reduce(0, Integer::sum);
//                .reduce(0, (left, right) -> left + right);
        System.out.println("reduce: " + reduce);

        int sum = numbersInt.stream().mapToInt(value -> value).sum();
        System.out.println("sum: " + sum);

        OptionalDouble average = numbersInt.stream().mapToInt(value -> value).average();
        System.out.println("average: " + average);

        OptionalDouble averageLong = numbersLong.stream().mapToLong(value -> value).average();
        System.out.println("averageLong: " + averageLong);

        long sum1 = numbersLong.stream().mapToLong(value -> value).sum();
        System.out.println("sum1: " + sum1);

        OptionalDouble averageDouble = numbersDouble.stream().mapToDouble(value -> value).average();
        System.out.println("averageDouble: " + averageDouble);

        double sumDouble = numbersDouble.stream().mapToDouble(value -> value).sum();
        System.out.println("sumDouble: " + sumDouble);

        OptionalDouble max = numbersDouble.stream().mapToDouble(value -> value).max();
        System.out.println("max: " + max);

        System.out.println();
        OptionalDouble average1 = DoubleStream
                .generate(Math::random)
                .peek(a -> System.out.println("El.: " + a))
                .limit(15)
                .average();
        System.out.println(average1);

        System.out.println();
        long sum2 = LongStream.iterate(5, a -> a * 10)
                .peek(l -> System.out.println(l))
                .limit(10).sum();
        System.out.println(sum2);

        System.out.println();

        LongStream.range(1, 5)
                .forEach(elem -> System.out.println("Ranged: " + elem));

        System.out.println();

        LongStream.rangeClosed(1, 5)
                .mapToDouble(v-> v*3.7)
                .forEach(elem -> System.out.println("Ranged: " + elem));

        DoubleStream iterate = DoubleStream.iterate(3, elem -> elem + 3.4);
        Stream<Double> boxed = DoubleStream.iterate(3, elem -> elem + 3.4).boxed();

    }
}
