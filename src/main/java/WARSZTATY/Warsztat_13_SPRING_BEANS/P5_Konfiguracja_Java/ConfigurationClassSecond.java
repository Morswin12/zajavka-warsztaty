package WARSZTATY.Warsztat_13_SPRING_BEANS.P5_Konfiguracja_Java;

import org.springframework.context.annotation.Bean;

public class ConfigurationClassSecond {

    @Bean
    public InjectedBean injectedBean() {
        return new InjectedBean();
    }

    @Bean
    public AnotherInjectedBean anotherInjectedBean() {
        return new AnotherInjectedBean();
    }
}
