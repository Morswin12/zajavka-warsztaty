package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P19_PROXY;

public class PizzaBakerImpl implements PizzaBaker {
    @Override
    public void bake(String pizza) {
        System.out.println("Baking pizza " + pizza);
    }
}
