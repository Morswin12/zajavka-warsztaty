package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P26_VISITOR.traditional;

import java.math.BigDecimal;

public class ShoppingCardVisitorImpl implements ShoppingCardVisitor{
    @Override
    public BigDecimal visit(Apple apple) {
        BigDecimal result = apple.getWeight().multiply(apple.getPricePerKg());
        System.out.println("Calculated total apple price: " + result);
        return result;
    }

    @Override
    public BigDecimal visit(Bicycle bicycle) {
        BigDecimal result = bicycle.getPrice().subtract(bicycle.getDiscount());
        System.out.println("Calculated total bicycle price: " + result);
        return result;
    }
}
