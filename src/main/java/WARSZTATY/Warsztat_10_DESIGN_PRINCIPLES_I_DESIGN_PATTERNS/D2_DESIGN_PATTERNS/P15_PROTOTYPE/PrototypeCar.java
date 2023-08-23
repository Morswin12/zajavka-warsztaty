package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P15_PROTOTYPE;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class PrototypeCar implements Cloneable {
    private String brand;
    private String model;
    private SteeringWheel steeringWheel;
    private List<String> doors;

    public PrototypeCar() {
        this.brand = "Ford";
        this.model = "Mustang";
        this.steeringWheel = SteeringWheel.of(12.4);
        this.doors = new ArrayList<>(Arrays.asList("lf", "rf", "lr", "rr"));
    }

//    public PrototypeCar swallowCopy() {
//        var newCar = new PrototypeCar();
//        newCar.steeringWheel = steeringWheel;
//        return newCar;
//    }
//
//    public PrototypeCar deepCopy() {
//        var newCar = new PrototypeCar();
//        var newSteeringWheel = new SteeringWheel();
//        newCar.steeringWheel = this.steeringWheel.deepCopy();
//        return newCar;
//    }

    @Override
    protected PrototypeCar clone() throws CloneNotSupportedException {
        final PrototypeCar cloned = (PrototypeCar) super.clone();
        cloned.brand = brand;
        cloned.model = model;
        cloned.steeringWheel = this.steeringWheel.clone();
        cloned.doors = new ArrayList<>(this.doors);
        return cloned;
    }
}
