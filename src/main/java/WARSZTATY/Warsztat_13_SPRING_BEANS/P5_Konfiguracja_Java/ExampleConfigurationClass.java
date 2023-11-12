package WARSZTATY.Warsztat_13_SPRING_BEANS.P5_Konfiguracja_Java;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {ConfigurationClassFirst.class, ConfigurationClassSecond.class})
public class ExampleConfigurationClass {

  /*Przenieśliśmy te biny do 2 klas, pokazać że można je rozdzielać celem zwiększenia przejrzystości kodu
    @Bean
    public ExampleBean exampleBean_goro(InjectedBean injectedBean, AnotherInjectedBean anotherInjectedBean) {
        return new ExampleBean(injectedBean, anotherInjectedBean);
    }

    @Bean
    public InjectedBean injectedBean() {
        return new InjectedBean();
    }

    @Bean
    public AnotherInjectedBean anotherInjectedBean() {
        return new AnotherInjectedBean();
    }*/
}
