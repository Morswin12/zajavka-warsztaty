package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P26_VISITOR.traditional;


import java.math.BigDecimal;

public interface ShoppingCardElement {

    BigDecimal accept(ShoppingCardVisitor visitor);
}
