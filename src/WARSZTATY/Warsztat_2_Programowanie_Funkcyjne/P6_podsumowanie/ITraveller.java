package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P6_podsumowanie;

@FunctionalInterface
public interface ITraveller {
    void travel(String destination);

    default void travel2(String destination) {
        System.out.println("dupa" + destination);
    }

    static void travel3(String s) {
        System.out.println("Static method" + s);
    }
}
