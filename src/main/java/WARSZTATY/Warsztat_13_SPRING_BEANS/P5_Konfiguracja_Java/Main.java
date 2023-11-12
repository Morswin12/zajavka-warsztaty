package WARSZTATY.Warsztat_13_SPRING_BEANS.P5_Konfiguracja_Java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {

    // @Configuration
    // @Bean
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);

        System.out.println("Context created");
        ExampleBean exampleBean = context.getBean("exampleBean_goro", ExampleBean.class);
        // nazwa beana musi być taka sama jak nazwa metody w klasie "ExampleConfigurationClass"
        // jeśli jest tylko jeden Bean takiej klasy jakiego beana tworzymy to nie musimy podawać jego nazwy:
        //      ExampleBean exampleBean = context.getBean(ExampleBean.class);
        exampleBean.exampleMethod();

        System.out.println();

        System.out.println("Context2 created");
        InjectedBean injectedBean = context.getBean("injectedBean", InjectedBean.class);
        injectedBean.injectedBeanMethodExample();

        System.out.println();

        Arrays.asList(context.getBeanDefinitionNames()).forEach(bean-> System.out.println(bean));

    }
}
