package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P13_ABSTRACT_FACTORY;

public class Main {
    public static void main(String[] args) {
    //AbstractFactory


        AbstractFactory<?> pizzaFactory = FactoryProvider.getFactory("Pizza");
        Object pepperoni = pizzaFactory.create("Pepperoni");
        System.out.println(pepperoni);
        AbstractFactory<?> carFactory = FactoryProvider.getFactory("Car");
        Object suv = carFactory.create("SUV");
        System.out.println(suv);
//        AbstractFactory<?> asdfFactory = FactoryProvider.getFactory("asdf");

    }
}
