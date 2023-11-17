package WARSZTATY.Warsztat_13_SPRING_BEANS.P_10_Wlasciwosci_Bean_Scope.code;

import org.springframework.stereotype.Service;

@Service
public class InjectedBean {

    public InjectedBean() {
        System.out.println("Calling InjectedBean()");
    }

    public void someMetod() {
        System.out.println("Calling InjectedBean# someMetod()");
    }
}
