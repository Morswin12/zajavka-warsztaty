package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P28_Map_TreeMap__Zaawansowane_kolekcje;

import java.util.*;

public class Main {
        public static void main(String[] args) {

            Map<String, String> treeMap = new TreeMap<>(Comparator.comparing(o->o.length()));
            treeMap.put("1A", "some treeMap1");
            treeMap.put("A1aa", "some treeMap2");
            treeMap.put("aAaaa", "some treeMap3");
            treeMap.put("BAa", "some treeMap4");
            treeMap.put("4Aaaaaaaaa", "some treeMap5");

            System.out.println(treeMap);

            for (String value : treeMap.values()) {
                System.out.println(value);
            }

            for (Map.Entry<String, String> entry : treeMap.entrySet()) {
                System.out.println(entry);
            }
            System.out.println();

            Map<Dog, String> treeDogsMap = new TreeMap<>((a,b) -> b.name.compareTo(a.name));
            treeDogsMap.put(new Dog("4"), "some treeDogsMap4");
            treeDogsMap.put(new Dog("2"), "some treeDogsMap2");
            treeDogsMap.put(new Dog("1"), "some treeDogsMap1");
            treeDogsMap.put(new Dog("5"), "some treeDogsMap5");
            treeDogsMap.put(new Dog("3"), "some treeDogsMap3");

            System.out.println(treeDogsMap);
            System.out.println();

            for (String value : treeDogsMap.values()) {
                System.out.println(value);
            }

            System.out.println();

            for (Map.Entry<Dog, String> entry : treeDogsMap.entrySet()) {
                System.out.println(entry);
            }


//            Map<String, String> hashMap = new HashMap<>();
//            hashMap.put("1A", "some hashMap1");
//            hashMap.put("A1", "some hashMap2");
//            hashMap.put("aA", "some hashMap3");
//            hashMap.put("BA", "some hashMap4");
//            hashMap.put("4A", "some hashMap5");
//
//            System.out.println(hashMap);
    }

    private static class Dog implements Comparable<Dog>{
        private final String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Dog: " + name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dog dog = (Dog) o;
            return Objects.equals(name, dog.name);
        }

        @Override
        public int hashCode() {
//            return Objects.hash(name);
            return 1;
        }

        @Override
        public int compareTo(Dog o) {
            return this.name.compareTo(o.name);
        }
    }

}
