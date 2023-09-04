package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P26_VISITOR.traditional;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Apple implements ShoppingCardElement {

    private BigDecimal pricePerKg;

    private BigDecimal weight;

    @Override
    public BigDecimal accept(ShoppingCardVisitor visitor) {
        return visitor.visit(this);
    }
}
