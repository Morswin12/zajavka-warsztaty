package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P23_CHAIN_OF_RESPONSIBILITY.StandardHandler;

import java.util.List;

public class ChainRunner {

    private final CarHandler carHandler;

    public ChainRunner() {
        this.carHandler = new CabrioletHandler();
        CarHandler handler2 = new JeepHandler();
        CarHandler handler3 = new CombiHandler();
        CarHandler handler4 = new ColorHandler();
        CarHandler handler5 = new EquipmentHandler();
        CarHandler handler6 = new QualityCheckHandler();

        carHandler.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        handler3.setNextHandler(handler4);
        handler4.setNextHandler(handler5);
        handler5.setNextHandler(handler6);
//        handler5.setNextHandler(null);
    }
    public static void main(String[] args) {
        ChainRunner chainRunner = new ChainRunner();
//        chainRunner.carHandler.handle(Car.of(Car.Type.CABRIOLET, "Blue", List.of("Steering Wheel")));
        chainRunner.carHandler.handle(Car.of(Car.Type.COMBI, "Gray", List.of("Steering Wheel", "7 seats")));
//        chainRunner.carHandler.handle(Car.of(Car.Type.JEEP, null, List.of("Wheel")));
//        chainRunner.carHandler.handle(Car.of(Car.Type.COMBI, "Yellow", null));
    }
}
