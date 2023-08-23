package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P13_ABSTRACT_FACTORY;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

@Data
public class PizzaFactory implements AbstractFactory<Pizza> {

    private static final Map<String, Supplier<Pizza>> PIZZA_MAP = new HashMap<>();

    static {
        PIZZA_MAP.put("Pepperoni", PepperoniPizza::new);
        PIZZA_MAP.put("Hawaiian", HawaiianPizza::new);
    }


    @Override
    public Pizza create(String type) {
        return Optional.ofNullable(PIZZA_MAP.get(type))
                .map(Supplier::get)
                .orElseThrow(() -> new RuntimeException(String.format("We don't have [%s] pizza ", type)));
    }
}
