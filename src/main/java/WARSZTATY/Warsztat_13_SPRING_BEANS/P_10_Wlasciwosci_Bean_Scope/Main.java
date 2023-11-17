package WARSZTATY.Warsztat_13_SPRING_BEANS.P_10_Wlasciwosci_Bean_Scope;

import WARSZTATY.Warsztat_13_SPRING_BEANS.P_10_Wlasciwosci_Bean_Scope.code.InjectedBean;
import WARSZTATY.Warsztat_13_SPRING_BEANS.P_10_Wlasciwosci_Bean_Scope.configuration.ExampleConfigurationClass;
import WARSZTATY.Warsztat_13_SPRING_BEANS.P_10_Wlasciwosci_Bean_Scope.configuration.ExamplePrototypeBean;
import WARSZTATY.Warsztat_13_SPRING_BEANS.P_10_Wlasciwosci_Bean_Scope.configuration.ExampleSingletonBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    // Scopes - zakresy beanów:
    //  1. Podstawowe:
    //      Singleton -> (domyślnie wszystkie beany w Springu są Singletonami),czyli za każdym razem, gdy będę pobierał
    //                  bina tego samego typu (np. context.getBean(SomeClass.class) to będzie to ten sam obiekt.
    //      Prototype -> możemy tak ustawić, żeby w przeciwieństwie do beana a ustawieniami domyślnymi, pobieraniu
    //                  beana tego samego typu tworzył się nowy obiekt (prototyp)
    //  2. w środowisku webowym:
    //      Request     -> będzie tworzył instancję serwisu per żądanie http
    //      Session     -> jedna instancja serwisu na jedną sesję http;
    //      Application -> jedną instancję serwisu na serwer context
    //      WebSocket   -> jedna instancja serwisu na web socket
    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);

        ExampleSingletonBean singleton1 = context.getBean(ExampleSingletonBean.class);
        ExampleSingletonBean singleton2 = context.getBean(ExampleSingletonBean.class);

        ExamplePrototypeBean prototype1 = context.getBean(ExamplePrototypeBean.class);
        ExamplePrototypeBean prototype2 = context.getBean(ExamplePrototypeBean.class);

        System.out.println("singleton1 == singleton2 " + (singleton1 == singleton2));
        System.out.println("prototype1 == prototype2 " + (prototype1 == prototype2));

        InjectedBean injectedBean = context.getBean(InjectedBean.class);
        boolean isInjectedBeanAsSingleton =
                injectedBean == singleton1.getInjectedBean()
                        && injectedBean == singleton2.getInjectedBean()
                        && injectedBean == prototype1.getInjectedBean()
                        && injectedBean == prototype2.getInjectedBean();

        System.out.println("Is InjectedBean a Singleton? " + isInjectedBeanAsSingleton);
    }
}
