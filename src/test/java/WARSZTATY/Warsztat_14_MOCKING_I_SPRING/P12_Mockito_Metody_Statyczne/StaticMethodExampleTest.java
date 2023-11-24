package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P12_Mockito_Metody_Statyczne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class StaticMethodExampleTest {

    @Spy
    private StaticMethodExample staticMethodExample = new StaticMethodExample();

    @Test
    void testGetNanoNow() {
        // given
        LocalTime now = LocalTime.now();
        int nanoNow = now.getNano();
        LocalTime nowEarlier = now.minusNanos(100);
        int nanoEarlier = nowEarlier.getNano();
        // Poniżej zaMocowaliśmy metodę .getNow(), aby zwracała nie aktualne wyliczenia, a zawsze tę samą wartość,
        //      która mamy wyżej przypisaną do zmiennej now
        Mockito.when(staticMethodExample.getNow()).thenReturn(nowEarlier);
        // when
        int result = staticMethodExample.getNano();
        //then
        Assertions.assertNotEquals(result, nanoNow);
        Assertions.assertEquals(result, nanoEarlier);
//        System.out.println(nanoNow);
//        System.out.println(result);
    }
//    @Test
//    void testGetNanoNow() {
//        // given
//        int nanoNow = LocalTime.now().getNano();
//        // when
//        int result = staticMethodExample.getNano();
//        //then
//        Assertions.assertEquals(result, nanoNow);
//        System.out.println(nanoNow);
//        System.out.println(result);
//    }
}