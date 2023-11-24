package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P_16_Spring_Application_Testing__Testy_Integracyjne_vs_mock;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class InputData {
    String width;
    String height;
    String depth;
}
