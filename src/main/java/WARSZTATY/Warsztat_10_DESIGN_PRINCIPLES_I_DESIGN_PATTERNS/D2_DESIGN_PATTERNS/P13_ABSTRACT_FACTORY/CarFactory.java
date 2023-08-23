package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P13_ABSTRACT_FACTORY;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

@Data
public class CarFactory implements AbstractFactory<Car> {

    private static final Map<String, Supplier<Car>> CAR_MAP = new HashMap<>();

    static {
        CAR_MAP.put("SUV", SUV::new);
        CAR_MAP.put("Combi", Combi::new);
    }


    @Override
    public Car create(String type) {
        return Optional.ofNullable(CAR_MAP.get(type))
                .map(Supplier::get)
                .orElseThrow(() -> new RuntimeException(String.format("We don't have [%s] pizza ", type)));
    }
}
