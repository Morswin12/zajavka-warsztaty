package WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model;

import lombok.Builder;
import lombok.Value;
import lombok.With;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Map;

@Value
@With
@Builder
public class InputData {

    static final BigDecimal PERCENT = new BigDecimal("100");
    ;
    @Builder.Default
    LocalDate repaymentStartDate = LocalDate.of(2020, 12, 10);
    @Builder.Default
    BigDecimal wiborPercent = BigDecimal.valueOf(1.70);
    @Builder.Default
    BigDecimal amount = BigDecimal.valueOf(301953.46);
    @Builder.Default
    BigDecimal monthsDuration = BigDecimal.valueOf(180);
    @Builder.Default
    MortgageType rateType = MortgageType.CONSTANT;
    @Builder.Default
    BigDecimal marginPercent = BigDecimal.valueOf(1.6);
    @Builder.Default
    BigDecimal overpaymentProvisionPercent = BigDecimal.valueOf(3);
    @Builder.Default
    BigDecimal overpaymentProvisionMonths = BigDecimal.valueOf(36);
    @Builder.Default
    BigDecimal overpaymentStartMonth = BigDecimal.valueOf(1);
    @Builder.Default
    Map<Integer, BigDecimal> overpaymentSchema = Map.of(2, BigDecimal.valueOf(10000), 3, BigDecimal.valueOf(10000), 5, BigDecimal.valueOf(10000), 6, BigDecimal.valueOf(10000), 7, BigDecimal.valueOf(10000));
    @Builder.Default
    String overpaymentReduceWay = Overpayment.REDUCE_PERIOD;
    @Builder.Default
    boolean mortgagePrintPayoffsSchedule = true;
    @Builder.Default
    Integer mortgageRateNumberToPrint = 1;

    public static InputData empty() {
        return InputData.builder().build();
    }

    public BigDecimal getWiborPercent() {
        return wiborPercent.divide(PERCENT, 4, RoundingMode.HALF_UP);
    }

    public BigDecimal getMarginPercent() {
        return marginPercent.divide(PERCENT, 4, RoundingMode.HALF_UP);
    }

    public BigDecimal getOverpaymentProvisionPercent() {
        return overpaymentProvisionPercent.divide(PERCENT, 4, RoundingMode.HALF_UP);
    }

    public BigDecimal getInterestPercent() {
        return getMarginPercent().add(getWiborPercent());
    }

    public BigDecimal getInterestToDisplay() {
        return wiborPercent.add(marginPercent);
    }
}