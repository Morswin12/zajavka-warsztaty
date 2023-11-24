package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P_16_Spring_Application_Testing__Testy_Integracyjne_vs_mock;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DepthCalculationServiceImpl implements DepthCalculationService{
    @Override
    public BigDecimal calculate(final InputData inputData) {
        return new BigDecimal(inputData.getDepth());
    }
}
