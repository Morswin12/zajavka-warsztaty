package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P32_Podsumowanie;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
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



        Optional<String> collect = List.of("jeden", "dwa", "trzy", "cztery", "pięć")
                .stream()
                .collect(Collectors.mapping(
                        a -> a.toUpperCase(),
                        Collectors.mapping((String v) -> v + " goro",
                                Collectors.maxBy(Comparator.naturalOrder()))));
        System.out.println(collect);
        System.out.println();


        List<String> jeden = List.of("jeden", "dwa", "trzy", "cztery", "pięć");
        Map<Boolean, List<String>> d = jeden.stream().collect(Collectors.partitioningBy(v -> v.contains("d")));
        System.out.println(d);
        System.out.println();


        Map<Integer, List<Ziomek>> collect1 = jeden.stream().collect(Collectors
                .toMap(
                        String::length,
                        name -> isAdd(name),
                        (a,b) -> addToListGoro(a.toString(),b.toString()),
                        TreeMap::new
                ));

        System.out.println(collect1);

    }

    private static ArrayList<Ziomek> isAdd(String name) {
        ArrayList<Ziomek> objects = new ArrayList<>();
        objects.add(new Ziomek(name));
        return objects;
    }

    private static ArrayList<Ziomek> addToListGoro(String a, String b) {
        ArrayList<Ziomek> result = new ArrayList<>();
        result.add(new Ziomek(a));
        result.add(new Ziomek(b));
        return result;
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
