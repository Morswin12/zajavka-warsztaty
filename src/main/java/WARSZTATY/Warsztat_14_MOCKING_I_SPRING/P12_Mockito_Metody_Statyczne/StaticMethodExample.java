package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P12_Mockito_Metody_Statyczne;

import java.time.LocalTime;

public class StaticMethodExample {

    public int getNano() {
//        LocalTime now = LocalTime.now();
        LocalTime now = getNow();
        return now.getNano();
    }

    public LocalTime getNow() {
        return LocalTime.now();
    }
}
