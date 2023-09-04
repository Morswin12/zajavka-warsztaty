package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P26_VISITOR.Lambda;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
         * VISITOR -> stosujemy na grupie podobnych obiektów. Grupa tych obiektów powinna mieć podobne zachowania. I
         *               możemy wziąć tę grupę podobnych zachowań z tych obiektów i umieścić w jednym miejscu w kodzie.
         *               Dzięki temu mamy zgrupowaną podobną logikę w jednym miejscu.
         *               Np. dodawanie produktów do koszyka w sklepie internetowym. Czyli różne przedmioty powinny mieć
         *               możliwość dodania się do koszyka.
         *
         * */

        List<ShoppingCardElement> elements = List.of(
                new Bicycle(BigDecimal.valueOf(100.25), BigDecimal.TEN),
                new Bicycle(BigDecimal.valueOf(200.25), BigDecimal.TEN),
                new Apple(BigDecimal.valueOf(234.32), BigDecimal.valueOf(2.54)),
                new Apple(BigDecimal.valueOf(21.32), BigDecimal.valueOf(3.44))
        );

        var visitorMap = new ShoppingCardVisitorMap();

        BigDecimal result = elements.stream()
                .map(element -> element.accept(visitorMap.apply(element.getClass())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Total Price Is: " + result);


    }
}
