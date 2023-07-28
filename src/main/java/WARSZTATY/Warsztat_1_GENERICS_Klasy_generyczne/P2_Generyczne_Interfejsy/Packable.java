package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P2_Generyczne_Interfejsy;

public interface Packable<T> {

    void pack(T element);

    T empty();
}
