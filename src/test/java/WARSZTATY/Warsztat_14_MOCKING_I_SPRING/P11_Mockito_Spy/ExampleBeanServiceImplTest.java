package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P11_Mockito_Spy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class ExampleBeanServiceImplTest {

    @InjectMocks
    private ExampleBeanServiceImpl exampleBeanService;

    @Spy  // w Spy dziaamy na prawdziwym obiekcie więc musimy wywołać konstruktor, aby użyć konkretnego obiektu,
          // w przeciwnym wypadku powstanie jakaś Mockitowska implementacja listy
    private List<String> sampleList = new ArrayList<>();

    @Test
    void thatSampleMethod_whenOneValueToAdd() {
        // given
        String testValue = "testValue";

        //when
        exampleBeanService.sampleMethod(testValue);

        //then
        Mockito.verify(sampleList).add(Mockito.anyString());
        Mockito.verify(sampleList).add(testValue);
        Assertions.assertEquals(1, sampleList.size());
    }
    @Test
    void thatSampleMethod_whenTwoValuesToAdd() {
        // given
        String testValue1 = "testValue1";
        String testValue2 = "testValue2";
//        Mockito.when(sampleList.size()).thenReturn(234);

        //when
        exampleBeanService.sampleMethod(testValue1, testValue2);

        //then
        Mockito.verify(sampleList, Mockito.times(2)).add(Mockito.anyString());
        Mockito.verify(sampleList).add(testValue1);
        Mockito.verify(sampleList).add(testValue2);
        Assertions.assertEquals(2, sampleList.size());
    }

}