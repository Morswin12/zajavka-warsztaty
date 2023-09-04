package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P26_VISITOR.Lambda;

import java.math.BigDecimal;

@FunctionalInterface
public interface ShoppingCardVisitor {

    BigDecimal visit(ShoppingCardElement element);
}
