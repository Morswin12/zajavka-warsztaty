package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P_16_Spring_Application_Testing__Testy_Integracyjne_vs_mock;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// JEST TO KONFIGURACJA TYLKO NA POTRZEBY TESTÓW -> nie będzie ona miała zastosowania przy głównej aplikacji, a odnosi
// się tylko do testów.
@Configuration
@ComponentScan(basePackageClasses = Marker.class)
public class TestBeanConfiguration {

    @Mock
    private DepthCalculationService depthCalculationService;

    public TestBeanConfiguration() {
        try (AutoCloseable autoCloseable = MockitoAnnotations.openMocks(this)) {
            System.out.println("<GoRo> Correctly opened mocks");
        } catch (Exception e) {
            System.err.println("<GoRo> Unable to open mocks " + e);
            throw new RuntimeException(e);
        }

    }

    @Bean
    public DepthCalculationService depthCalculationService() {
        return depthCalculationService;
    }

    @Bean
    public WidthCalculationService widthCalculationService() {
        return Mockito.mock(WidthCalculationService.class);  // to robi to samo co:
                                                        // @Mock
                                                        // private WidthCalculationService widthCalculationService;
                                                        // jak przy DepthCalculationService.
    }
}
