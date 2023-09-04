package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P23_CHAIN_OF_RESPONSIBILITY.StandardHandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

import java.util.List;

@Data
@With
@AllArgsConstructor(staticName = "of")
public class Car {

    private Type type;

    private String color;

    private List<String> equipment;
    enum Type{
        CABRIOLET,
        JEEP,
        COMBI
    }
}
