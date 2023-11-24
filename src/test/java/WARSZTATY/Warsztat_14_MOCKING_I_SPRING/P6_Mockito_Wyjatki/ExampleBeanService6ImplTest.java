package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P6_Mockito_Wyjatki;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class ExampleBeanService6ImplTest {

    @InjectMocks
    private ExampleBeanService6Impl exampleBeanService6;

    @Mock
    private InjectedBeanService6 injectedBeanService6;

    @Test
    void sampleMethod6() {
        // given
        Mockito
                .when(injectedBeanService6.anotherSampleMethod6(ArgumentMatchers.anyString()))
                .thenThrow(new RuntimeException("jaba daba du exception"));
        Mockito
                .doThrow()
                .when(injectedBeanService6)
                .anotherSampleMethod6(ArgumentMatchers.anyString());

        // when
        assertThrows(RuntimeException.class, () -> exampleBeanService6.sampleMethod6());

    }
}