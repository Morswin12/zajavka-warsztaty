package WARSZTATY.Warsztat_7_LOGOWANIE.P5_Logowanie_LOGBACK_Console_cz1.logger2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logger2 {
    private static final Logger log = LoggerFactory.getLogger(Logger2.class);

    public static void log() {
        log.trace("Logging trace message in: {}", Logger2.class.getName());
        log.debug("Logging debug message in: {}", Logger2.class.getName());
        log.info("Logging info message in: {}", Logger2.class.getName());
    }
}
