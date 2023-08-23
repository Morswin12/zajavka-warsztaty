package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P12_FACTORY;

public class Main {
    /*
    Factory Pattern - Fabryki używamy, gdy
     */
    public static void main(String[] args) {
        Pizza pepperoni = PizzaFactory.preparePizza("Pepperoni");
        pepperoni.bake();
        System.out.println("Sauce: " + pepperoni.whatSauce());
        System.out.println(pepperoni);

        Pizza hawaiian = PizzaFactory.preparePizza("Hawaiian");
        hawaiian.bake();
        System.out.println("Sauce: " + hawaiian.whatSauce());
        System.out.println(hawaiian);

//        Pizza otherPizza = PizzaFactory.preparePizza("Some other pizza");
    }
}
