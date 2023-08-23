package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P16_ADAPTER;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class DimensionAdapterImpl implements DimensionAdapter{
    private static final double INCH_TO_METER = 0.0254;
    private Dimension dimension;


    @Override
    public BigDecimal getDimension() {
        return convertInchToMeter(dimension.getDimension());
    }

    private BigDecimal convertInchToMeter(BigDecimal dimension) {
        return BigDecimal.valueOf(INCH_TO_METER).multiply(dimension);
    }
}
