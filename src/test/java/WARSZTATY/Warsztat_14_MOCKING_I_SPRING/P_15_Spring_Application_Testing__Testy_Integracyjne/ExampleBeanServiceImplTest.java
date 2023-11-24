package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P_15_Spring_Application_Testing__Testy_Integracyjne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExampleBeanServiceImplTest {

    @InjectMocks
    private ExampleBeanServiceImpl exampleBeanService;

    @Mock
    private InjectedBeanService injectedBeanService;

    @Test
    public void testSampleMethod() {
        // given
        when(injectedBeanService.anotherSampleMethod()).thenReturn(true);

        // when
        boolean result = exampleBeanService.sampleMethod();

        // then
        Assertions.assertTrue(result);
    }
}