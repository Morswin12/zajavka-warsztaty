package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P21_BRIDGE;

import lombok.ToString;

@ToString
public class Red implements Color {

    @Override
    public String apply() {
        return "Color is RED";
    }
}
