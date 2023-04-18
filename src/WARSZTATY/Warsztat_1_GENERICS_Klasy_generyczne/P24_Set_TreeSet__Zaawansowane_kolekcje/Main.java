package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P24_Set_TreeSet__Zaawansowane_kolekcje;

import java.util.*;

public class Main {

    /*
    TreeSet implementuje interfejs NavigableSet. Ten interfejs zapewnia kilka interesujących metod. Ich sygnatury
        metod są następujące:
    E lower(E e) - Zwraca najwiekszy element, który jest < e, lub null jeśli taki element nie istnieje
    E floor(E e) - Zwraca najwiekszy element, który jest <= e, lub null jeśli taki element nie istnieje
    E celing(E e) - Zwraca najmniejszy element, który jest >= e, lub null jeśli taki element nie istnieje
    E higher(E e) - Zwraca najmniejszy element, który jest > e, lub null jeśli taki element nie istnieje

     */

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 4, 1, 84, 5, 1, 2, 5, 3, 2, 5, 2, 1, 5, 2, 1, 52, 33, 45, 2, 535);

        Set<Integer> treeSet = new TreeSet<>(integerList);
        Set<Integer> hashSet = new HashSet<>(integerList);

        System.out.println("Tree" + treeSet);
        System.out.println("Hash" + hashSet);

        Set<Dog> dogSet1 = new TreeSet<>( );
        Set<Dog> dogSet = new TreeSet<>((o1, o2) -> o1.name.compareTo(o2.name));

        dogSet.add(new Dog("Romek1"));
        dogSet.add(new Dog("Romek2"));
        dogSet.add(new Dog("Romek3"));
        dogSet.add(new Dog("Romek4"));
        dogSet.add(new Dog("Romek5"));
        dogSet.add(new Dog("Romek6"));
        dogSet.add(new Dog("Romek6"));
        dogSet.add(new Dog("Romek6"));

        System.out.println(dogSet );

        NavigableSet<Integer> navigableSet = new TreeSet<>();
        for (int i = 0; i <= 100; i++) {
            navigableSet.add(i);
        }

        System.out.println(navigableSet.lower(50));
        System.out.println(navigableSet.lower(0));
        System.out.println(navigableSet.floor(50));
        System.out.println(navigableSet.ceiling(90));
        System.out.println(navigableSet.higher(90));
        System.out.println(navigableSet.ceiling(100));
        System.out.println(navigableSet.higher(100));

    }

    private static class Dog implements Comparable<Dog> {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "D: " + name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dog dog = (Dog) o;
            return name.equals(dog.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
//       return 1;
        }

        @Override
        public int compareTo(Dog o) {
            return o.name.compareTo(this.name);
        }
    }

}
