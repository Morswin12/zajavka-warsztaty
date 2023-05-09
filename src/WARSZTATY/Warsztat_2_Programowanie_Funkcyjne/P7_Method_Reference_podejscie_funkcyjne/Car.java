package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P7_Method_Reference_podejscie_funkcyjne;

public class Car {
    private final SteeringWheel steeringWheel;

    public Car(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "steeringWheel=" + steeringWheel +
                '}';
    }
}
