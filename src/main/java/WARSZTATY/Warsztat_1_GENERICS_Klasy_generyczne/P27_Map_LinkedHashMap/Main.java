package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P27_Map_LinkedHashMap;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Main {

    /*
    void clear()                        - czysci wszystko
    boolean isEmpty()                   -  sprawdza czy jest pusty
    int size()
    V get(Object key)                   - wyciaga wartosc po kluczu
    V put(K key, V value)
    V remove(Object key)
    boolean containsKey(Object key)     - czy zawera klucz key
    boolean containsValue(Object value) - czy zawera wartosc value
    Set<K> keySet()                     - zwraca Set wszystkich kluczy
    Collection<V> value()               - zwraca kolekcje wszystkich wartosci
     */
    public static void main(String[] args) {

        Map<String, Integer> someMap = new LinkedHashMap<>();
        someMap.put("A", 123);
        someMap.put("E", 123);
        someMap.put("C", 123);
        someMap.put("D", 123);
        someMap.put("B", 123);

        System.out.println(someMap);

        for (Map.Entry<String, Integer> entry : someMap.entrySet()) {
            System.out.println(entry);
        }

        Map<Dog, Integer> dogIntegerMap = new LinkedHashMap<>();
        dogIntegerMap.put(new Dog("A"), 2);
        dogIntegerMap.put(new Dog("E"), 3);
        dogIntegerMap.put(new Dog("C"), 1);
        dogIntegerMap.put(new Dog("D"), 6);
        dogIntegerMap.put(new Dog("B"), 3);

        for (Map.Entry<Dog, Integer> dogIntegerEntry : dogIntegerMap.entrySet()) {
            System.out.println(dogIntegerEntry);
        }

    }

    private static class Dog {
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
    }

}
