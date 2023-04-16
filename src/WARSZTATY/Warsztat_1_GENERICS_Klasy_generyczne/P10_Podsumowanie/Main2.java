package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P10_Podsumowanie;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Animal> animalList = Arrays.asList(new Dog(), new Animal(), new Dog());
        List<Dog> dogsList = Arrays.asList(new Dog(), new Dog(), new Dog());
        List<Jamnik> jamnikList = Arrays.asList(new Jamnik(), new Jamnik(), new Jamnik());
        List<MiniJamnik> miniJamnikList = Arrays.asList(new MiniJamnik(), new MiniJamnik(), new MiniJamnik());

        List<? super Dog> allList1 = animalList;
        List<? super MiniJamnik> allList2 = dogsList;
        List<? extends Jamnik> allList3 = jamnikList;
        List<? extends MiniJamnik> allList4 = miniJamnikList;

//        allList1.add(new Animal());
        allList1.add(new Dog());
        allList1.add(new Jamnik());
        allList1.add(new MiniJamnik());

    }
    static class Animal {
        @Override
        public String toString() {
            return "Animal{}";
        }
    }

    static class Dog extends Animal {
        @Override
        public String toString() {
            return "Dog{}";
        }
    }

    static class Jamnik extends Dog {
        @Override
        public String toString() {
            return "Pigeon{}";
        }
    }

    static class MiniJamnik extends Jamnik {
        @Override
        public String toString() {
            return "Pigeon{}";
        }
    }


}