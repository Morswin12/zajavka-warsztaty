package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P21_BRIDGE;

import lombok.ToString;

@ToString(callSuper = true)
public class Triangle extends Shape{
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Triangle color is:  " + color);
    }
}
