package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P28_Map_TreeMap__Zaawansowane_kolekcje;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableExample {
    public static void main(String[] args) {
        NavigableMap<Integer, Integer> navigableMap = new TreeMap<>();
        navigableMap.put(72, 13);
        navigableMap.put(12, 23);
        navigableMap.put(22, 33);
        navigableMap.put(33, 43);
        navigableMap.put(52, 53);

        System.out.println(navigableMap);
        System.out.println();

        System.out.println(navigableMap.ceilingEntry(33) + " - ceilingEntry");
        System.out.println(navigableMap.ceilingKey(33) + "    - ceilingKey");
        System.out.println(navigableMap.floorEntry(33) + " - floorEntry");
        System.out.println(navigableMap.floorKey(33) + "    - floorKey");
        System.out.println(navigableMap.higherEntry(33) + " - higherEntry");
        System.out.println(navigableMap.higherKey(33) + "    - higherKey");
        System.out.println(navigableMap.lowerEntry(33) + " - lowerEntry");
        System.out.println(navigableMap.lowerKey(33) + "    - lowerKey");

        System.out.println(navigableMap.firstEntry() + "    - firstEntry");
        System.out.println(navigableMap.firstKey() + "    - firstKey");
        System.out.println(navigableMap.lastEntry() + "    - lastEntry");
        System.out.println(navigableMap.lastKey() + "    - lastKey");

    }
}
