package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P29_Podsumowanie_Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        Map<Integer, String> ourMap = new HashMap<>();
//        Map<Integer, String> ourMap = new LinkedHashMap<>();
        Map<Integer, String> ourMap = new TreeMap<>();
        ourMap.put(5, "Ja");
        ourMap.put(1, "Ty");
        ourMap.put(2, "Ty");
        ourMap.put(1, "Ty");
//        ourMap.putAll(ourMap); //nic nie doda, bo sie dubluje

        System.out.println(ourMap);
//           System.out.println(ourMap.get(5));
//        System.out.println(ourMap.get(4));
//        System.out.println(ourMap.getOrDefault(4, "Koń"));
//        System.out.println(ourMap.getOrDefault(1, "Koń"));

//        System.out.println(ourMap.containsKey(1));
//        System.out.println(ourMap.remove(1, "To"));
//        System.out.println(ourMap.remove(1, "Ty"));
//        System.out.println(ourMap);
//        System.out.println(ourMap.remove(5));
//        System.out.println(ourMap);

        Map<Finger, String> myMap = new LinkedHashMap<>();
        myMap.put(new Finger("MAły"), "Finger1");
        myMap.put(new Finger("MAły"), "Finger3");
        myMap.put(new Finger("MAły1"), "Finger2");
        myMap.put(new Finger("MAły"), "Finger4");
        myMap.put(new Finger("MAły"), "Finger6");
        myMap.put(new Finger("MAły"), "Finger5");
        System.out.println(myMap);

        Map<Finger, String> myTreeMap = new TreeMap<>(
                (a, b) -> {
                    int i = b.name.compareTo(a.name);
                    System.out.println("Lambda calling .. " + i);
                    return i;
                }
        );
        myTreeMap.put(new Finger("MAły"), "Finger1");
        myTreeMap.put(new Finger("MAły"), "Finger3");
        myTreeMap.put(new Finger("MAły1"), "Finger2");
        myTreeMap.put(new Finger("MAły"), "Finger4");
        myTreeMap.put(new Finger("MAły5"), "Finger6");
        myTreeMap.put(new Finger("MAły4"), "Finger5");
        System.out.println(myTreeMap);
    }

    private static class Finger implements Comparable<Finger> {
        private String name;

        public Finger(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Finger finger = (Finger) o;
            boolean equals = Objects.equals(name, finger.name);
            System.out.println("equals " + this.name + " equals: " + equals);
            return equals;
        }

        @Override
        public int hashCode() {
            int hash = Objects.hash(name);
            System.out.println("hashCode " + this.name + " hash: " + hash );
            return hash;
        }

        @Override
        public String toString() {
            return "Finger";
        }

        @Override
        public int compareTo(Finger o) {
            System.out.println("compareTo" + this.name);
            return this.name.compareTo(o.name);
        }
    }


}
