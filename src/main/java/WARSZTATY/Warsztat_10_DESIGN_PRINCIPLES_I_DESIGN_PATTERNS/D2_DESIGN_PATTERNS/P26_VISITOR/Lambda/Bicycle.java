package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P26_VISITOR.Lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Bicycle implements ShoppingCardElement {

    private BigDecimal price;

    private BigDecimal discount;

}
