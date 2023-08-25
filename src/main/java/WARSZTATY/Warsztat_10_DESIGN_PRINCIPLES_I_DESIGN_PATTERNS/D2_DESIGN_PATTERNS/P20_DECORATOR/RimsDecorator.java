package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P20_DECORATOR;

public class RimsDecorator extends CarDecorator {

    public RimsDecorator(Car car) {
        super(car);
    }

    @Override
    public String create() {
        return super.create() + withRims();
    }

    private String withRims() {
        return " with " + this.getClass().getSimpleName();
    }
}
