package WARSZTATY.Warsztat_13_SPRING_BEANS.P6_Konfiguracja_Adnotacje.code;

import org.springframework.stereotype.Service;

@Service
public class InjectedBean {

    public InjectedBean() {

        System.out.println("Calling InjectedBean()");
    }

    public void someMethodInjectedBean() {
        System.out.println("Calling someMethodInjectedBean()");
    }

}
