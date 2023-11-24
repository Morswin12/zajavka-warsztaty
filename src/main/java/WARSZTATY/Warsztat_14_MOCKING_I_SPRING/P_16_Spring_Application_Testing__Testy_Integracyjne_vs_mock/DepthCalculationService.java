package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P_16_Spring_Application_Testing__Testy_Integracyjne_vs_mock;

import java.math.BigDecimal;

public interface DepthCalculationService {
    BigDecimal calculate(InputData inputData);
}
