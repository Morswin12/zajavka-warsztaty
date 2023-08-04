package WARSZTATY.Warsztat_7_LOGOWANIE.P1_P2__Intro;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    //   framework
    //   java.util.logging
    //   log4j  ->  log4j 2
    //   logback
    //      logback-core
    //      logback-classic - zawiera wsparcie slf4j
    //      logback-access
    //  slf4j - simple login facade - taka nakładka, która pod sobą używa jednego z framework'ów: java.util.logging, log4j lub logback
    //  nakładka -> original framework -> robi co trzeba
    //  Logger - klasa która pozwala nam logować w odniesieniu do klasy, w której wystąpi log
    //  Handler - obiekt odpowiedzialny za dostarczenie loga tam, gdzie chcemy
    //  jest wiele rodzajów Handler-ów, np.
    //    ConsoleHandler - służy do wyświetlania logów w konsoli
    //    FileHandler
    //    StreamHandler
    //    SocketHandler
    //    itp.
    // Dlaczego nie robimy tego przy użyciu System.out.println()?
    //      - pisanie koa od nowa, czas
    //      - napotkamy problemy, które kto ju rozwiązał
    //      - może spowolnić apkę, a biblioteki są zoptymalizowane
    //      - priorytetyzacja logów
    //      - wyłączenie logów


    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());


    void someVoid() {
        LOGGER.log(Level.INFO, "some message to log");
    }

}
