package WARSZTATY.Warsztat_11_KOLEJNE_WERSJE_JAVY.P16_Java_17;

public class Main {
    public static void main(String[] args) {
        // Sealed Classes -> klasy zapieczętowane (decydujemy kto może dziedziczyć
        // Pattern Matching for Switch

//        methodNewJava17(new Horse());
    }

    public static void methodOld(Animal animal) {
        if (animal instanceof Cat cat) {
            System.out.println("Here is CAT");
        } else if (animal instanceof Dog dog) {
            System.out.println("Here is DOG");
        } else if (animal instanceof Horse horse) {
            System.out.println("Here is HORSE");
        } else {
            System.out.println("No idea! ");
        }

    }
//    public static void methodNewJava17(Animal animal) {
//        switch (animal) {
//            case Cat cat -> System.out.println("Here is CAT");
//            case Dog dog -> System.out.println("Here is DOG");
//            case Horse horse -> System.out.println("Here is HORSE");
//            case null, default -> System.out.println("No idea! ");
//        }
//}
}
