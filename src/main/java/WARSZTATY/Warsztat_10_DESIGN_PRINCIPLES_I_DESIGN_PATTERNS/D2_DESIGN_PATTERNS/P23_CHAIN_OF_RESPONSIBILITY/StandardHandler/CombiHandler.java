package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P23_CHAIN_OF_RESPONSIBILITY.StandardHandler;

import java.util.ArrayList;
import java.util.List;

public class CombiHandler implements CarHandler {

    private CarHandler nextHandler;

    @Override
    public void setNextHandler(CarHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Car car) {
        if (Car.Type.COMBI.equals(car.getType())) {
            System.out.println("Preparing Combi Skeleton");
            final List<String> combiEquipment = new ArrayList<>(car.getEquipment());
            combiEquipment.add("Big Space in Back");
            this.nextHandler.handle(car.withEquipment(combiEquipment));
        } else {
            this.nextHandler.handle(car);
        }
    }
}
