package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P26_VISITOR.Lambda;

import java.math.BigDecimal;
import java.util.Map;
import java.util.function.Function;


public class ShoppingCardVisitorMap implements Function<Class<? extends ShoppingCardElement>, ShoppingCardVisitor> {

    private static final Map<Class<? extends ShoppingCardElement>, ? extends ShoppingCardVisitor> VISITORS = Map.of(
            Apple.class, element -> visit((Apple) element),
            Bicycle.class, element -> visit((Bicycle) element)
    );

    private static BigDecimal visit(final Apple apple) {
        BigDecimal totalCost = apple.getWeight().multiply(apple.getPricePerKg());
        System.out.println("Calculated apple cost: " + totalCost);
        return totalCost;
    }

    private static BigDecimal visit(final Bicycle bicycle) {
        BigDecimal totalCost = bicycle.getPrice().subtract(bicycle.getDiscount());
        System.out.println("Calculated bicycle cost: " + totalCost);
        return totalCost;
    }

    @Override
    public ShoppingCardVisitor apply(Class<? extends ShoppingCardElement> aClass) {
        return VISITORS.get(aClass);
    }
}
