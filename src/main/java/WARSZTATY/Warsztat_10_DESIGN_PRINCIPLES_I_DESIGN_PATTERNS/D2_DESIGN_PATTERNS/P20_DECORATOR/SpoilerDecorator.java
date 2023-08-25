package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P20_DECORATOR;

public class SpoilerDecorator extends CarDecorator {
    public SpoilerDecorator(Car car) {
        super(car);
    }

    @Override
    public String create() {
        return super.create() + withSpoiler();
    }

    private String withSpoiler() {
        return " with " + this.getClass().getSimpleName();
    }
}
