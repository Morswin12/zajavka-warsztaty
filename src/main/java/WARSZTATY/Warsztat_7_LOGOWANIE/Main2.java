package WARSZTATY.Warsztat_7_LOGOWANIE;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main2 {

    private static final Logger LOGGER = Logger.getLogger(Main2.class.getName());

    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "some message to log with level INFO");
        LOGGER.log(Level.WARNING, "some message to log with level WARNING");
    }
}
