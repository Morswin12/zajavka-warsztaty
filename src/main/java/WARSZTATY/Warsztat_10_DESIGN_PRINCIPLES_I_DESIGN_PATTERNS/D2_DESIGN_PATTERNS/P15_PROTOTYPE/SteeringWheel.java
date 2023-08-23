package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P15_PROTOTYPE;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class SteeringWheel implements Cloneable {
    private double diameter;

    public SteeringWheel deepCopy() {
        var newSteeringWheel = new SteeringWheel();
        newSteeringWheel.diameter = diameter;
        return newSteeringWheel;
    }

    @Override
    protected SteeringWheel clone() throws CloneNotSupportedException {
        return (SteeringWheel) super.clone();
    }
}
