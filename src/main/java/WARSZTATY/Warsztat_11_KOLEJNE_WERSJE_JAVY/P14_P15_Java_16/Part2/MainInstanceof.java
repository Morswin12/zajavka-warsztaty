package WARSZTATY.Warsztat_11_KOLEJNE_WERSJE_JAVY.P14_P15_Java_16.Part2;

public class MainInstanceof {
    public static void main(String[] args) {

        method(new Cat());
        method(new Animal());
    }

    static void method(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println("Something like cat is happy :)" + cat.mrry());

        }
    }

    static void methodNewJava16(Animal animal) {
        // od java 16 moemy uzywac skrconej wercji instanceof jak poniżej bez potrzeby rzutowania jak wyżej
        if (animal instanceof Cat cat) {
            System.out.println("Something like cat is happy :)" + cat.mrry());

        }
    }
}
