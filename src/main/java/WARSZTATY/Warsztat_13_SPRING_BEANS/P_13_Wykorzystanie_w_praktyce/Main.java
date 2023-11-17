package WARSZTATY.Warsztat_13_SPRING_BEANS.P_13_Wykorzystanie_w_praktyce;

import WARSZTATY.Warsztat_13_SPRING_BEANS.P_13_Wykorzystanie_w_praktyce.configuration.ApplicationConfiguration;
import WARSZTATY.Warsztat_13_SPRING_BEANS.P_13_Wykorzystanie_w_praktyce.service.MainProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

//  Bez Springa musielibyśmy napisać to tak (manualnie połączyć ze sobą te klasy:
//        MainProcessor mainProcessor = new MainProcessor(
//                new DataRepository(),
//                new DataProcessingService(
//                        new StringPreparationService()
//                )
//        );

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        MainProcessor mainProcessor = context.getBean(MainProcessor.class);
        mainProcessor.process();

    }
}
