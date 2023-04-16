package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P7_UpperBound_Wildcart_gorna_Granica_Wieloznaczna;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildCartMain {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Monkey> monkeys = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<ImplementingVoicable> implementingVoicables = new ArrayList<>();

        print(animals);
        print(dogs);
        print(monkeys);
//        print(strings);
        print(implementingVoicables);

        print2(animals);
        print2(dogs);
        print2(monkeys);
//        print2(strings);
//        print2(implementingVoicables);

        List<? extends Animal> list = dogs;
//        list.add(new Animal());
//        list.add(new Dog());
        list.remove(0);
    }

    private static void print(List<? extends Voicable> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
    private static void print2(List<? extends Animal> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    static interface Voicable {
    }

    static class Animal implements Voicable {


    }

    static class Monkey extends Animal{

    }

    static class Dog extends Animal{

    }

    static class ImplementingVoicable implements Voicable {
    }

}

