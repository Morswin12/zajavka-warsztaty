package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P12_Interfejsy_Funkcyjne_Ciekawe_Przypadki;

import java.util.*;

public class FunctionalInterfaceJavaExamples {
    public static void main(String[] args) {
        Optional.of("afasfdsad")
                .map(s -> s.length())
                .filter(x -> x > 6)
                .ifPresent(s -> System.out.println(s));

        List<String> strings = new ArrayList<>();
        strings.removeIf(x -> x.contains("asda"));

        Map<Integer, Cat> map = new HashMap<>();
        map.put(1, new Cat("goro1"));
        map.put(2, new Cat("goro2"));
        map.put(3, new Cat("goro3"));
        map.put(4, new Cat("goro4"));

        System.out.println(map);
        map.replaceAll((Integer key, Cat value) -> new Cat(value.name +" changed") );
        System.out.println(map);

    }

    static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

}
