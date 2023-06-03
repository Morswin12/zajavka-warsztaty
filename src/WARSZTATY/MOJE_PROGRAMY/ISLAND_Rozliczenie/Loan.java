package WARSZTATY.MOJE_PROGRAMY.ISLAND_Rozliczenie;

import java.math.BigDecimal;
import java.util.List;

public class Loan {
    private final BigDecimal netto;
    private final BigDecimal brutto;
    private final BigDecimal tax;
    private final MonthsHours monthsHours;

    public Loan(List<Dniowka> workHouresInMont) {
        this.monthsHours = new MonthsHours(workHouresInMont);

        this.brutto = BigDecimal.valueOf(monthsHours.getNormalHours()*3000+monthsHours.getExtraHours()*3000*1.8);
        this.netto = nettoCalculation(workHouresInMont);
        this.tax = taxCalculation(workHouresInMont);
    }

    private Integer houresInMonthCalculation(List<Dniowka> workHouresInMont) {
        return 0;
    }

    private BigDecimal taxCalculation(List<Dniowka> workHouresInMont) {
        return BigDecimal.ZERO;
    }

    private BigDecimal bruttoCalculation(List<Dniowka> workHouresInMont) {
        return BigDecimal.ZERO;
    }

    private BigDecimal nettoCalculation(List<Dniowka> workHouresInMont) {

        return BigDecimal.ZERO;}

}
