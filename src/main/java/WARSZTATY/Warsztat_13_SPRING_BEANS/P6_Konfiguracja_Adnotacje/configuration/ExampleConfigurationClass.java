package WARSZTATY.Warsztat_13_SPRING_BEANS.P6_Konfiguracja_Adnotacje.configuration;

import WARSZTATY.Warsztat_13_SPRING_BEANS.P6_Konfiguracja_Adnotacje.code.Marker_goro;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// Tutaj musimy podać ścieżkę gdzie są nasze klasy lub nazwę interfejsu markującego "Marker" lub jak chcemy, który
//      umieszczamy w tej paczce. Zamiast markera możemy też użyć jakiejś istniejącej klasy, np. Main
//@ComponentScan(basePackages = "WARSZTATY.Warsztat_13_SPRING_BEANS.P6_Konfiguracja_Adnotacje.code")
@ComponentScan(basePackageClasses = Marker_goro.class)
public class ExampleConfigurationClass {
}
