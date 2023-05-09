package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P7_Method_Reference_podejscie_funkcyjne;

public class SteeringWheel {
    private final double diameter;

    public SteeringWheel(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "diameter=" + diameter +
                '}';
    }
}
