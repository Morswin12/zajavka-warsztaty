package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P_15_Spring_Application_Testing__Testy_Integracyjne;

import org.junit.jupiter.api.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NoSpringTestContextFrameworkExampleTest {

    private ExampleBeanService exampleBeanService;

    //Ręcznie podnosimy context Springa przed każdym testem:
    @BeforeEach
    public void setUp() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigScanBean.class);
        exampleBeanService = context.getBean(ExampleBeanService.class);

        Assertions.assertNotNull(exampleBeanService);
    }

    // Ręcznie po każdym teście zerujemy exampleBeanService
    @AfterEach
    public void tearDown() {
        exampleBeanService = null;
        Assertions.assertNull(exampleBeanService);
    }

    @Test
    public void testSampleMethod() {
        boolean result = exampleBeanService.sampleMethod();
        Assertions.assertFalse(result);
    }
}
