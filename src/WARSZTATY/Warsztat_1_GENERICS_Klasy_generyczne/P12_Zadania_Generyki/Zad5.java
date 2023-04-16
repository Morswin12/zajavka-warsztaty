package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P12_Zadania_Generyki;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Zad5 {
    public static void main(String[] args) {
        List<Long> longList = Arrays.asList(23l, 323l, 54l, 4l, 8l, 345l, 656l, 111l, 222l, 323l);
        List<Integer> intList = Arrays.asList(23, 323, 54, 4, 8, 345, 656, 111, 222, 323);
        List<Double> doubleList = Arrays.asList(23.2, 323.2, 54.2, 4.2, 8.2, 345.2, 656.2, 111.2, 222.2, 323.2);
        List<Float> floatList = Arrays.asList(23.5f, 323.5f, 54.5f, 4.5f, 8.5f, 345.5f, 656.5f, 111.5f, 222.5f, 323.5f);

        System.out.println(maxValueBetweenAAndB(longList, 41l, 333l).orElse(null));
        System.out.println(maxValueBetweenAAndB(intList, 444, 500).orElse(null));
        System.out.println(maxValueBetweenAAndB(doubleList, 0.0, 500.0).orElse(null));
        System.out.println(maxValueBetweenAAndB(floatList, 0.0f, 1500.0f).orElse(null));
    }

    public static <T extends Number> Optional<T> maxValueBetweenAAndB(List<T> list, T start, T end) {
        T maxValue = null;

        for (T el : list) {
            if (el.doubleValue() >= start.doubleValue() && el.doubleValue() < end.doubleValue()) {
                if (Objects.isNull(maxValue) || el.doubleValue() > maxValue.doubleValue()) {
                    maxValue = el;
                }
            }
        }
        return Optional.ofNullable(maxValue);
    }
}
