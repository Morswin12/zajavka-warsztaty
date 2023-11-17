package WARSZTATY.Warsztat_13_SPRING_BEANS.P_11_Wlasciwosci_Scoped_Bean_Injection_Problem.code;

import org.springframework.beans.factory.ObjectFactory;

import java.time.LocalTime;

public class SingletonBean {

//    private PrototypeBean prototypeBean;
    // aby rozwiązać "Scope Bean Injected Problem" musimy opakować PrototypeBean w ObjectFactory i zmienić to też w
    // innych klasach zależnych. A w Main musimy dodać .getObject na końcu.
    private ObjectFactory<PrototypeBean> prototypeBean;

    public SingletonBean(ObjectFactory<PrototypeBean> prototypeBean) {
        this.prototypeBean = prototypeBean;
        System.out.println("Calling SingletonBean()");
    }

    public ObjectFactory<PrototypeBean> callPrototype() {
        System.out.println("Calling Prototype " + LocalTime.now());
        return prototypeBean;
    }
}
