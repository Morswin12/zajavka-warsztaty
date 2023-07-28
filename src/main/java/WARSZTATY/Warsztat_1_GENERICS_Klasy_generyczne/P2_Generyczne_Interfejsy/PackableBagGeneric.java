package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P2_Generyczne_Interfejsy;

public class PackableBagGeneric<T> implements Packable<T>{
    @Override
    public void pack(T element) {

    }

    @Override
    public T empty() {
        return null;
    }
}
