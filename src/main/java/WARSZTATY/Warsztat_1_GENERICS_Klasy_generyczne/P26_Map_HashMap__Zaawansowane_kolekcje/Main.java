package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P26_Map_HashMap__Zaawansowane_kolekcje;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashMap;
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
//        Set<String> stringSet = Set.of("A");
//        Map<String, String> stringStringMap = Map.of("2", "ASDF");

        Map<String, String> someMap = new HashMap<>();
        someMap.put("1", "ABC");
        someMap.put("2", "DEF");
        someMap.put("1", "GHI");
        someMap.put("4", "JKL");
        System.out.println(someMap);

        someMap.getOrDefault("5", "coś zamiennego");

        Map<Dog, String> dogStringMap = new HashMap<>();

        Dog andrzej = new Dog("Andrzej");
        Dog stefan1 = new Dog("Stefan");
        Dog zbyszek = new Dog("Zbyszek");
        Dog stefan2 = new Dog("Stefan");

        dogStringMap.put(andrzej, "Hau Andrzeju");
        dogStringMap.put(stefan1, "asdasdas");
        dogStringMap.put(zbyszek, "ewrwerewr");
        dogStringMap.put(stefan2, "srfsdfsdf");

        System.out.println(dogStringMap);

        System.out.println(dogStringMap.get(stefan1));
        System.out.println(dogStringMap.get(stefan2));

        stefan1.setName("Stefan1");
        System.out.println(dogStringMap.get(stefan1));

        stefan1.setName("Stefan");
        System.out.println(dogStringMap.get(stefan1));


        Map<Dog, String> dogStringMaps = new HashMap<>();

        LocalTime before = LocalTime.now();
        for (int i = 0; i < 100_000; i++) {
            dogStringMaps.put(new Dog("Dog" + i / 15), "some value");
        }

        System.out.println("Loop took: " + Duration.between(before, LocalTime.now()).toMillis());
    }

    private static class Dog {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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
