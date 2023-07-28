package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P8_Podsumowanie_method_reference;

public class Ship {
    private final String model;

    public Ship() {
        this.model = "kłoda";
    }

    public Ship(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getModel(Ship ship) {
        return model;
    }

    @Override
    public String toString() {
        return "Ship" + model;
    }
}
