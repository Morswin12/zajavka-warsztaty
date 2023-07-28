package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P8_Generics_Lower_bound_Wildcard_dolna_granice_wieloznacznosci;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundsWildcartMain {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());

        addFlyingDog(dogs);
        addFlyingDog(animals);

        List<? super Dog> list1 = dogs;
        List<? super Dog> list2 = animals;

        list1.add(new FlyingDog());
        list1.add(new Dog());
        list1.add(new MoreFlyingDog());
//        list1.add(new Animal());
    }

    private static void addFlyingDog(List<? super Dog> list) {
        list.add(new FlyingDog());
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