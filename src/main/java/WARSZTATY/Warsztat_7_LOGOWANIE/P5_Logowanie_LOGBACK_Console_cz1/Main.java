package WARSZTATY.Warsztat_7_LOGOWANIE.P5_Logowanie_LOGBACK_Console_cz1;

import WARSZTATY.Warsztat_7_LOGOWANIE.P5_Logowanie_LOGBACK_Console_cz1.logger1.Logger1;
import WARSZTATY.Warsztat_7_LOGOWANIE.P5_Logowanie_LOGBACK_Console_cz1.logger2.Logger2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.trace("Logging trace message in: {}", Main.class.getName());
        log.debug("Logging debug message in: {}", Main.class.getName());
        log.info("Logging info message in: {}", Main.class.getName());
        log.warn("Logging warn message in: {}", Main.class.getName());
        log.error("Logging error message in: {}", Main.class.getName());

        Logger1.log();
        Logger2.log();
    }
}
