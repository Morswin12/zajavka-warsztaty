package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P12_FACTORY;

import lombok.Data;

@Data
public class HawaiianPizza implements Pizza {

    @Override
    public String whatSauce() {
        return "Sweet";
    }

    @Override
    public void bake() {
        System.out.println("I'm soo baking my pineapple!");
    }

    public void morePineaple() {
        System.out.println("more Pineapple!");
    }
}
