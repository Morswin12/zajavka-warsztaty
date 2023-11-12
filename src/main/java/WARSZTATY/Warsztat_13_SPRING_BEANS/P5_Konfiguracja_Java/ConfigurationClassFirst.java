package WARSZTATY.Warsztat_13_SPRING_BEANS.P5_Konfiguracja_Java;

import org.springframework.context.annotation.Bean;

public class ConfigurationClassFirst {

    @Bean
    public ExampleBean exampleBean_goro(InjectedBean injectedBean, AnotherInjectedBean anotherInjectedBean) {
        return new ExampleBean(injectedBean, anotherInjectedBean);
    }
}
