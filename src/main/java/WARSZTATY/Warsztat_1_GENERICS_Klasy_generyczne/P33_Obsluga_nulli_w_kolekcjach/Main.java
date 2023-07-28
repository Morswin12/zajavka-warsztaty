package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P33_Obsluga_nulli_w_kolekcjach;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> someMap = new TreeMap<>();
        someMap.put("1", 2);
        someMap.put("4", null);
//        someMap.put(null, 6);
        System.out.println(someMap);

        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(2);
//        integerSet.add(2);

        Queue<String> stringQueue = new ArrayDeque<>();
        stringQueue.offer("asdsa");
//        stringQueue.offer(null);

        Set<Integer> someSetWithNull = new TreeSet<>((a, b) ->
        {
            if (a == null && b != null) {
                return -1;
            }
            if (a != null && b == null) {
                return 1;
            }
            if (a == null && b == null) {
                return 0;
            }
            return a - b;
        });
        someSetWithNull.add(1);
        someSetWithNull.add(2);
        someSetWithNull.add(null);
        someSetWithNull.add(3);
        System.out.println(someSetWithNull);

//        Comparator<Integer> comparator = Comparator.nullsFirst();
    }
}
