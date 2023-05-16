package WARSZTATY.MOJE_PROGRAMY.Drewno_calculate_Volume;

public class Wood {
    private final Integer diameter;
    private final Double longSize;
    private final Integer amount;
    private final Double objetosc;

    public Wood(Integer diameter, Double longSize, Integer amount) {
        this.diameter = diameter;
        this.longSize = longSize;
        this.amount = amount;
        this.objetosc = calculateObjetosc(diameter, longSize, amount);
    }

    private Double calculateObjetosc(Integer diameter, Double longSize, Integer amount) {
        Double radius = (double) (diameter / 2);
        Double radiusCm = radius/100;

        return Math.PI * radiusCm * radiusCm * amount*longSize;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public Double getLongSize() {
        return longSize;
    }

    public Integer getAmount() {
        return amount;
    }

    public Double getObjetosc() {
        return objetosc;
    }

    @Override
    public String toString() {
        return "Kłoda {" +
                "o średnicy = " + diameter +
                ", i długości = " + longSize +
                ", w ilości: =" + amount +
                '}';
    }
}
