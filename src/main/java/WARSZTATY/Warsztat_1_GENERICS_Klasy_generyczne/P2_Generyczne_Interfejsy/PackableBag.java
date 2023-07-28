package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P2_Generyczne_Interfejsy;

public class PackableBag implements Packable<Car> {
    @Override
    public void pack(Car element) {

    }

    @Override
    public Car empty() {
        return null;
    }
}
