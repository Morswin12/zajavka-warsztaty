package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P20_DECORATOR;


public abstract class CarDecorator implements Car {

    private final Car car;

    protected CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String create() {
        return car.create();
    }
}
