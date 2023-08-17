package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P12_FACTORY;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

@Data
public class PizzaFactory {

    private static final Map<String, Supplier<Pizza>> PIZZA_MAP = new HashMap<>();

    static {
        PIZZA_MAP.put("Pepperoni", PepperoniPizza::new);
        PIZZA_MAP.put("Hawaiian", HawaiianPizza::new);
    }

    public static Pizza preparePizza(final String whatPizza) {
        return Optional.ofNullable(PIZZA_MAP.get(whatPizza))
                .map(Supplier::get)
                .orElseThrow(() -> new RuntimeException(String.format("We don't have [%s] pizza ", whatPizza)));
    }
    public static Pizza preparePizza2(final String whatPizza) {
        switch (whatPizza) {
            case "Pepperoni":
                return new PepperoniPizza();
            case "Hawaiian" :
                return new HawaiianPizza();
            default:
                throw new RuntimeException("Sorry we don't have this pizza :( ");
        }
    }
}
