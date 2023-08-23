package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P13_ABSTRACT_FACTORY;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class FactoryProvider {

    private static final Map<String, Supplier<AbstractFactory<?>>> FACTORIES_MAP = new HashMap<>();

    static {
        FACTORIES_MAP.put("Pizza", PizzaFactory::new);
        FACTORIES_MAP.put("Car", CarFactory::new);
    }

    public static AbstractFactory<?> getFactory(String whatFactory) {
        return Optional.ofNullable(FACTORIES_MAP.get(whatFactory))
                .map(Supplier::get)
                .orElseThrow(() -> new RuntimeException("Sory gregory, nima, Zwracamy ino Samochody i Piccerinki"));
        //        switch (whatFactory) {
//            case "Pizza":
//                return new PizzaFactory();
//            case "Car":
//                return new CarFactory();
//            default:
//                throw new RuntimeException("wrong Factory Name");
//        }

    }
}
