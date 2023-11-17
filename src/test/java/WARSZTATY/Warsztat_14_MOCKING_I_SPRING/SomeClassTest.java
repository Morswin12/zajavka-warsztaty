package WARSZTATY.Warsztat_14_MOCKING_I_SPRING;

import WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P2_Mockowanie_Mockito.SomeClass;
import WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P2_Mockowanie_Mockito.SomeOtherClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomeClassTest {

    @InjectMocks
    private SomeClass someClass;

    @Mock
    // lub @Spy
    private SomeOtherClass someOtherClass;

    @Test
    void someTest() {
        Mockito.when(someOtherClass.someOtherMetod()).thenReturn("Great job");

        someClass.someMethod();

//     możemy też narzucić, aby zostało sprawdzone, czy mock został użyty, czy też nie i inne rzeczy.
//        Mockito.verify()
//        Mockito.verifyNoInteractions();
    }
}
