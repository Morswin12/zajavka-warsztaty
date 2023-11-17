package WARSZTATY.Warsztat_13_SPRING_BEANS.P_11_Wlasciwosci_Scoped_Bean_Injection_Problem;

import WARSZTATY.Warsztat_13_SPRING_BEANS.P_11_Wlasciwosci_Scoped_Bean_Injection_Problem.code.PrototypeBean;
import WARSZTATY.Warsztat_13_SPRING_BEANS.P_11_Wlasciwosci_Scoped_Bean_Injection_Problem.code.SingletonBean;
import WARSZTATY.Warsztat_13_SPRING_BEANS.P_11_Wlasciwosci_Scoped_Bean_Injection_Problem.configuration.ExampleConfigurationClass11;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    // Scope Bean Injected Problem

    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass11.class);
        System.out.println("context created");

        SingletonBean firstSingleton = context.getBean(SingletonBean.class);
        PrototypeBean firstPrototype = firstSingleton.callPrototype().getObject();

        SingletonBean secondSingleton = context.getBean(SingletonBean.class);
        PrototypeBean secondPrototype = secondSingleton.callPrototype().getObject();

        System.out.println("firstPrototype == secondPrototype? " + (firstPrototype == secondPrototype) );
    }
}
