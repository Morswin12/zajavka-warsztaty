package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P23_CHAIN_OF_RESPONSIBILITY.StandardHandler;

import java.util.Objects;

public class EquipmentHandler implements CarHandler{

    private CarHandler nextHandler;
    @Override
    public void setNextHandler(CarHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Car car) {
        if (Objects.nonNull(car.getEquipment())) {
            System.out.printf("Preparing equipment: %s%n", car.getEquipment());
            this.nextHandler.handle(car);
        } else {
            this.nextHandler.handle(car);
        }
    }
}
