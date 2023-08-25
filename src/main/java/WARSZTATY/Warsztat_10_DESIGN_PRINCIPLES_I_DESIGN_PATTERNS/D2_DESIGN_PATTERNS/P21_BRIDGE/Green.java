package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P21_BRIDGE;

import lombok.ToString;

@ToString
public class Green implements Color{
    @Override
    public String apply() {
        return "Color is GREEN";
    }
}
