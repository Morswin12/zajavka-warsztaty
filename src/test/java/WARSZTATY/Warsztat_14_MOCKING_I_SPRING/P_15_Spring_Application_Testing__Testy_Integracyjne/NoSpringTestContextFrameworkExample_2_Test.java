package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P_15_Spring_Application_Testing__Testy_Integracyjne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = ConfigScanBean.class)
// Zamiast tych dwóch powyższych adnotacji możemy także użyć jednej jak poniżej:
@SpringJUnitConfig(classes = ConfigScanBean.class)
public class NoSpringTestContextFrameworkExample_2_Test {

    @Autowired
    private ExampleBeanService exampleBeanService;

    @BeforeEach
    public void setUp() {
        Assertions.assertNotNull(exampleBeanService);
    }

    @Test
    public void testSampleMethod() {
        boolean result = exampleBeanService.sampleMethod();
        Assertions.assertFalse(result);
    }
}
