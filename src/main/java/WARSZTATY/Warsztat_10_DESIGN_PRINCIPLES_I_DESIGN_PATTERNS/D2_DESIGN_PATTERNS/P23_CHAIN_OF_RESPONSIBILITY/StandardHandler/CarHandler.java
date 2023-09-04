package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P23_CHAIN_OF_RESPONSIBILITY.StandardHandler;

public interface CarHandler {
    void setNextHandler(CarHandler nextHandler);

    void handle(Car car);

}
