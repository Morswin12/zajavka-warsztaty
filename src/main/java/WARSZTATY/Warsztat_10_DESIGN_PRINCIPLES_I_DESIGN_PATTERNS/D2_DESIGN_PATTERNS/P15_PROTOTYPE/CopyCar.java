package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P15_PROTOTYPE;

import lombok.Data;

@Data
public class CopyCar {
    // shallow copy
    // deep copy
    private SteeringWheel steeringWheel;

    public CopyCar shallowCopy() {
        var newCar = new CopyCar();
        newCar.steeringWheel = steeringWheel;
        return newCar;
    }

    public CopyCar deepCopy() {
        var newCar = new CopyCar();
        newCar.steeringWheel = this.steeringWheel.deepCopy();
        return newCar;
    }
}
