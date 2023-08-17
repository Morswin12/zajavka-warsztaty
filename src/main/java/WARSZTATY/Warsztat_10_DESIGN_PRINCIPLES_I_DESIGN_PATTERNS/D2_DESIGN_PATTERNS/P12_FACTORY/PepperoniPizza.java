package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P12_FACTORY;

import lombok.Data;

@Data
public class PepperoniPizza implements Pizza{
    @Override
    public String whatSauce() {
        return "Spicy";
    }

    @Override
    public void bake() {
        System.out.println("I'm soo baking!");
    }

    public void beMoreSpacy() {
        System.out.println("be more spacy! ");
    }
}
