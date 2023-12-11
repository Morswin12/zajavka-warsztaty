package WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage;

import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.configuration.CalculatorConfiguration;
import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.services.MortgageCalculationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MortgageCalculatorApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CalculatorConfiguration.class);
        MortgageCalculationService mortgageCalculationService = context.getBean(MortgageCalculationService.class);
        mortgageCalculationService.calculate();
    }
}
