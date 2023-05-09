package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P7_Method_Reference_podejscie_funkcyjne;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MainInstanceExample {

    public static void main(String[] args) {
        MainInstanceExample main = new MainInstanceExample();
        main.run();

    }

    private void run() {
        DogPrinter dogPrinter = new DogPrinter();
        String someDog = Optional.of(new Dog("Arek"))
//                .map(d -> d.getName())
                .map(Dog::dajName)
                .orElse("No name");
        System.out.println(someDog);

        Optional.of(new Dog("Czerwuś"))
//                .ifPresent(pies-> System.out.println(pies));
                .ifPresent(System.out::println);

        Optional.of(new Dog("Pojar"))
//                .ifPresent(d->printDoggy(d));
                .ifPresent(this::printDoggy);

        Optional.of(new Dog("Suczek"))
                .ifPresent(dogPrinter::printDoggyyyyyy);

        Optional.of(new Dog("Statyczny kundel"))
                .ifPresent(MainInstanceExample::printDoggyStatic);


        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Kudłaty"));
        dogs.add(new Dog("Brudas"));
        dogs.add(new Dog("Świr"));
        System.out.println(dogs);
//        dogs.sort((a,b)-> a.dajName().compareTo(b.dajName()));
        dogs.sort(Comparator.comparing(Dog::dajName));
        System.out.println(dogs);
    }

    private void printDoggy(final Dog dog) {
        System.out.println(dog);
    }
   static void printDoggyStatic(final Dog dog) {
        System.out.println(dog);
    }

}
