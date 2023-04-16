package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P9_dziwne_przyklady_generykow;

import java.util.ArrayList;
import java.util.List;

public class WeirdMain {
    public static void main(String[] args) {
        List<?> animals1 = new ArrayList<Animal>();
        List<? extends Animal> animals2 = new ArrayList<Animal>();
        List<? super Animal> animals3 = new ArrayList<Animal>();
        animals3.add(new Animal());
        List<? super Dog> animals4 = new ArrayList<Animal>();
//        animals1.add(new Animal());
//        animals2.add(new Animal());
        animals3.add(new Animal());
//        animals4.add(new Animal());

//        method2(animals2, 2);
    }

    static <T> T method1(T element) {
        return element;
    }

    static <T extends Animal> T method2(List<T> element, int i) {
        int k = i;
        while (k > element.size()) {
            k--;
        }
        return element.get(k);
    }

    static class Animal {
    }

    static class Dog extends Animal {
    }

    static class FlyingDog extends Dog {
    }

    static class MoreFlyingDog extends FlyingDog {
    }
}
