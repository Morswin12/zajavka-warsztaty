package WARSZTATY.Warsztat_13_SPRING_BEANS.P6_Konfiguracja_Adnotacje;

import WARSZTATY.Warsztat_13_SPRING_BEANS.P6_Konfiguracja_Adnotacje.code.ExampleBean;
import WARSZTATY.Warsztat_13_SPRING_BEANS.P6_Konfiguracja_Adnotacje.code.InjectedBean;
import WARSZTATY.Warsztat_13_SPRING_BEANS.P6_Konfiguracja_Adnotacje.configuration.ExampleConfigurationClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    // Spring stereotypes - są to pewne konkretne adnotacje do których możemy się odnosić po to żeby na podstawie
    // definicji klasy tworzyć beany. Włas nie te adnotacje będą się nazywały stereotypami Springowymi
    // Np.:
    //      @Component  - jakiś podstawowy/nieszczególny bean
    //      @Service    - zarezerwowane dla beanów, które tworzą jakąś logikę biznesową
    //      @Repository - adnotacja do beanów, które mają do czynienia z dostępem do danych (np. do komunikacji z
    //                    Bazą Danych
    //      @Controller - charakterystyczny rodzaj beana, który będzie obsługiwał zapytania i to wszystko będzie
    //                    związane z wystawianiem swojego własnego API

    // Musimy pamiętać o:
    //      Component scanning      -> skanowaniu komponentów
    //      Automatic bean binding  -> automatycznym wiązaniu beanów
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);

        System.out.println("Context created");
//        Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);

        InjectedBean injectedBean = context.getBean(InjectedBean.class);
        injectedBean.someMethodInjectedBean();

        System.out.println();

        ExampleBean exampleBeanContext = context.getBean(ExampleBean.class);
        exampleBeanContext.someMethodExampleBean();
    }
}
