package WARSZTATY.Warsztat_7_LOGOWANIE.P4_Logowanie_LSF4J;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        log.trace("Hello! some parametr: {}", 123);
        log.debug("Hello! some parametr: {}", 234);
        log.info("Hello! some parametr: {}, zajavka: {}", 345, 900);
        log.warn("Hello! some parametr: {}", 456);
        log.error("Hello! some parametr: {}", 788);

        // wydrukowao tylko info, warn,error, bo takie s ustawienia ogólne (domyślne naszej aplikacji (aplikacja została uruchomiona z poziomem logowania INFO
        //[main] INFO WARSZTATY.Warsztat_7_LOGOWANIE.P4_Logowanie_LSF4J.Main - Hello! some parametr: 5555
        //[main] WARN WARSZTATY.Warsztat_7_LOGOWANIE.P4_Logowanie_LSF4J.Main - Hello! some parametr: 777457
        //[main] ERROR WARSZTATY.Warsztat_7_LOGOWANIE.P4_Logowanie_LSF4J.Main - Hello! some parametr: 939393

    }
}
