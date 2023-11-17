package WARSZTATY.Warsztat_13_SPRING_BEANS.P_11_Wlasciwosci_Scoped_Bean_Injection_Problem.configuration;

import WARSZTATY.Warsztat_13_SPRING_BEANS.P_11_Wlasciwosci_Scoped_Bean_Injection_Problem.Main;
import WARSZTATY.Warsztat_13_SPRING_BEANS.P_11_Wlasciwosci_Scoped_Bean_Injection_Problem.code.PrototypeBean;
import WARSZTATY.Warsztat_13_SPRING_BEANS.P_11_Wlasciwosci_Scoped_Bean_Injection_Problem.code.SingletonBean;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackageClasses = Main.class)
public class ExampleConfigurationClass11 {

    @Bean
    // Tu scope defaultowe. czyli Singleton
    public SingletonBean singletonBean(final ObjectFactory<PrototypeBean> prototypeBean) {
        return new SingletonBean(prototypeBean);
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }
}
