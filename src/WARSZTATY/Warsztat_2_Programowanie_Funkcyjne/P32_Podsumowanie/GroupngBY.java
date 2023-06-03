package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P32_Podsumowanie;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupngBY {
    public static void main(String[] args) {
        //      Collector       Operacja terminująca:
        //      counting        count
        //      joining         reduce
        //      toCollection    -
        //      toList/toSet    -
        //      minBy/maxBy     (min/max)
        //      reducing        (reduce)
        //      mapping         -
        //      partitioningBy  -
        //      toMap           -
        //      groupingBy      -


        List<String> jeden = List.of("jeden", "dwa", "trzy", "cztery", "pięć");

        var collect = Stream.of("jeden", "dwa", "trzy", "cztery", "pięć", "sześć", "siedem")
                .collect(Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toCollection(ArrayList::new)
                ));
        System.out.println(collect);


    }

    private static class Ziomek {
        private final String name;

        public Ziomek(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Ziomek{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}

