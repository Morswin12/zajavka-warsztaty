package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P3_Mockito_Przyklady;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class ExampleBeanServiceImplTest {

    @InjectMocks
    private ExampleBeanServiceImpl exampleBeanService;

    @Mock
    private InjectedBeanService injectedBeanService;

    @Test
    void sampleMethod() {
        // given
        Mockito.when(injectedBeanService.anotherSampleMethod()).thenReturn(true);


//        ExampleBeanService exampleBeanService = new ExampleBeanServiceImpl();
//        // poniżej używamy klasy stworzonej poniżej tylko po to, żeby zaślepić zależność, aby był to test jednostkowy
//        exampleBeanService.setInjectedBeanService(() -> true);

        // when
        boolean result = exampleBeanService.sampleMethod();

        // then
        assertTrue(result);  // skrócona wersja assencji
    }

//    static class StubInjectedBeanService implements InjectedBeanService {
//
//        @Override
//        public boolean anotherSampleMethod() {
//            return true;
//        }
//    }
}