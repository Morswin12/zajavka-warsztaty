package WARSZTATY.Warsztat_13_SPRING_BEANS.P_10_Wlasciwosci_Bean_Scope.configuration;

import WARSZTATY.Warsztat_13_SPRING_BEANS.P_10_Wlasciwosci_Bean_Scope.Main;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Main.class)
public class ExampleConfigurationClass {

}
