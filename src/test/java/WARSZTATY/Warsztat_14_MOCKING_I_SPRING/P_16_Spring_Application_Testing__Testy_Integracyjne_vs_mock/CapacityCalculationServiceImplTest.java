 package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P_16_Spring_Application_Testing__Testy_Integracyjne_vs_mock;

 import org.junit.jupiter.api.Assertions;
 import org.junit.jupiter.api.BeforeEach;
 import org.junit.jupiter.api.Test;
 import org.junit.jupiter.api.extension.ExtendWith;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.test.context.ContextConfiguration;
 import org.springframework.test.context.junit.jupiter.SpringExtension;

 import java.math.BigDecimal;

 import static org.mockito.ArgumentMatchers.any;
 import static org.mockito.Mockito.when;

 @ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {TestBeanConfiguration.class})
//@ContextConfiguration(classes = {BeanConfiguration.class})
class CapacityCalculationServiceImplTest {

    @Autowired
    private CapacityCalculationService capacityCalculationService;
    @Autowired
    private WidthCalculationService widthCalculationService;
    @Autowired
    private HeightCalculationService heightCalculationService;
    @Autowired
    private DepthCalculationService depthCalculationService;

    @BeforeEach
    void setUp() {
        Assertions.assertNotNull(capacityCalculationService);
        Assertions.assertNotNull(widthCalculationService);
        Assertions.assertNotNull(heightCalculationService);
        Assertions.assertNotNull(depthCalculationService);

    }

    @Test
    void someCalculation() {
        // given
        final var inputData = someInputData();
        when(widthCalculationService.calculate(any(InputData.class))).thenReturn(BigDecimal.TEN);
        when(depthCalculationService.calculate(any(InputData.class))).thenReturn(new BigDecimal("20"));

        // when
        final var result = capacityCalculationService.someCalculation(inputData);

        // then
        Assertions.assertEquals(new BigDecimal("600"), result);

    }

    private InputData someInputData() {
        return InputData
                .builder()
                .depth("1")
                .width("2")
                .height("3")
                .build();
    }

}