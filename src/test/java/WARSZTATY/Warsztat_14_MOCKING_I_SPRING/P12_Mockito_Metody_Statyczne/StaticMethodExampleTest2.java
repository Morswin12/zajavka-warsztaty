package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P12_Mockito_Metody_Statyczne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.time.LocalTime;

class StaticMethodExampleTest2 {

    private StaticMethodExample staticMethodExample = new StaticMethodExample();

    @Test
    void testGetNanoNow() {
        // given
        LocalTime now = LocalTime.now();
        int nanoNow = now.getNano();
        LocalTime nowEarlier = now.minusNanos(200);
        int nanoEarlier = nowEarlier.getNano();

        int result;
        try (MockedStatic<LocalTime> timeMock = Mockito.mockStatic(LocalTime.class)) {
            timeMock.when(LocalTime::now).thenReturn(nowEarlier);

            // when
            result = staticMethodExample.getNano();
        }

        // then
        Assertions.assertNotEquals(result, nanoNow);
        Assertions.assertEquals(result, nanoEarlier);
    }

    @Test
    void getNow() {
    }
}