package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P23_CHAIN_OF_RESPONSIBILITY.StandardHandler;

public class QualityCheckHandler implements CarHandler{
//ostatni handler

    @Override
    public void setNextHandler(CarHandler nextHandler) {
    }

    @Override
    public void handle(Car car) {
        System.out.printf("Checking quality!%n");
    }
}
