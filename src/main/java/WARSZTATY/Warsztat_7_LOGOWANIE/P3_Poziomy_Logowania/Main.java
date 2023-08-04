package WARSZTATY.Warsztat_7_LOGOWANIE.P3_Poziomy_Logowania;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    void someVoid() {
        LOGGER.log(Level.INFO, "some message to log");

//        LOGGER.log(Level.FINE,"some message to log");
        //
        // Poniżej są u standaryzowane loginy z slf4j, paczka util.loggin ich nie ma tylko log(i tu dajemy jej odpowiedniki)
//        LOGGER.trace("some message to log");  - poziom 1 najniższy, najbardziej szczegółowy, który najbardziej zaśmieca, bo ma najbardziej szczegółowe informacje;
//        LOGGER.debug("some message to log");  - poziom 2 mniej szczegółowy, ale służy do zdebugowania aplikacji i znalezienia błędów, też nieużywany na co dzień w życiu aplikacji
//        LOGGER.info("some message to log");   - poziom 3 taki poziom, używany na co dzień, aby zapisywał normalny przebieg aplikacji
//        LOGGER.warn("some message to log");   - poziom 4 mówi, że wystąpił błąd, ale nie krytyczny, kod normalnie się kompiluje, ostrzega, że coś się dzieje, ale nie musi to byc błędem
//        LOGGER.error("some message to log");  - poziom 5 najwyższy priorytet tu już wychodzą błędy krytyczne, np. klient nie może się zalogować, lub zakupić czegoś
//       można jeszcze znaleźć czasami fatal ale slf4j nie wspiera go

//jeżeli uruchomimy aplikacje np z poziomem logowania info to będzie logowane to i wszystko wyżej (info, warn, error)
        // Przykładowy log:
//        19-02-2009 16:23:25 WARN WARSZTATY.Warsztat_7_LOGOWANIE.P3_Poziomy_Logowania.Main  some message to log
//        19-02-2009 16:23:26 INFO WARSZTATY.Warsztat_7_LOGOWANIE.P3_Poziomy_Logowania.Main  some message to log
//        19-02-2009 16:23:54 ERROR WARSZTATY.Warsztat_7_LOGOWANIE.P3_Poziomy_Logowania.Main  some message to log
//        19-02-2009 16:25:26 INFO WARSZTATY.Warsztat_7_LOGOWANIE.P3_Poziomy_Logowania.Main  some message to log
//        19-02-2009 16:26:26 INFO WARSZTATY.Warsztat_7_LOGOWANIE.P3_Poziomy_Logowania.Main  some message to log
    }
}
