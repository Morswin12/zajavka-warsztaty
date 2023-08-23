package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P17_COMPOSITE;

public class Elephant implements Animal {
    @Override
    public void eat(Food food) {
        System.out.println("Elephant eating food: " + food);
    }
}
