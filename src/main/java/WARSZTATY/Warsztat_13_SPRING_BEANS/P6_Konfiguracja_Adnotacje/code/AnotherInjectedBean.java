package WARSZTATY.Warsztat_13_SPRING_BEANS.P6_Konfiguracja_Adnotacje.code;

import org.springframework.stereotype.Component;

@Component
public class AnotherInjectedBean {

    public AnotherInjectedBean() {

        System.out.println("Calling AnotherInjectedBean()");
    }
}
