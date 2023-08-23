package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P14_BUILDER;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Tractor {

    private final String brand;
    private final String model;
    private final String horsePower;
    private final String color;
    private final Fuel fuel;
    private final String year;
    private final Boolean tur;
    private final Boolean tuz;

}
