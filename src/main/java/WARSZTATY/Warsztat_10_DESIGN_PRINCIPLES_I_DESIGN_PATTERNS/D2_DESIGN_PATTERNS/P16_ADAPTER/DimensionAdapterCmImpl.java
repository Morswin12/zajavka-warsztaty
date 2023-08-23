package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P16_ADAPTER;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class DimensionAdapterCmImpl implements DimensionAdapterCm {
    private static final double INCH_TO_CM = 2.54;

    private Dimension dimension;

    @Override
    public BigDecimal getDimensionCm() {
        return convertInchToCm(dimension);
    }

    private BigDecimal convertInchToCm(Dimension dimension) {
        return dimension.getDimension().multiply(BigDecimal.valueOf(INCH_TO_CM));
    }
}
