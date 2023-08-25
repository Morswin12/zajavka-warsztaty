package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P19_PROXY;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PizzaBakerProxy implements PizzaBaker {

    private static final List<String> DENIED_PIZZAS = List.of("Hawaiian");
    private final PizzaBaker pizzaBaker;

    @Override
    public void bake(String pizza) {
        if (DENIED_PIZZAS.contains(pizza)) {
            throw new RuntimeException(String.format("%s? We don't do this here", pizza));
        } else {
            pizzaBaker.bake(pizza);
        }
    }
}
