package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P5_Mockito__Bledna_konfiguracja_Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ExampleBeanServiceImplTest {

    @InjectMocks
    private ExampleBeanServiceImpl exampleBeanService;

    @Mock
    private InjectedBeanService injectedBeanService;

    @Test
    void sampleMethod() {
        // given
//        Mockito.when(injectedBeanService.anotherSampleMethod("zajavka")).thenReturn("my Value");
        Mockito.when(injectedBeanService.anotherSampleMethod(ArgumentMatchers.anyString())).thenReturn("my Value");

        // when
        String result1 = exampleBeanService.sampleMethod();

        // then
        assertEquals("my Value", result1);
    }

}