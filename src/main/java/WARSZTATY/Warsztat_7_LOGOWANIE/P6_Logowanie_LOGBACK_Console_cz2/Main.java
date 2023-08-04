package WARSZTATY.Warsztat_7_LOGOWANIE.P6_Logowanie_LOGBACK_Console_cz2;

public class Main {
    //<?xml version="1.0" encoding="UTF-8" ?>
    //<configuration>
    //<!--    tu określamy appender w zestawieniu z konretnymi klasami logback-a, w tym przypadku Console, czyli logowanie do konsoli jego nazwa nie musi się nazywać CONSOLE tylko jak chcemy-->
    //    <appender name="CONSOLE" class="ch.qos.logback.core.ConsoleAppender">
    //        <encoder>
    //            <pattern>%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n</pattern>
    //        </encoder>
    //    </appender>
    //    <appender name="CONSOLE2" class="ch.qos.logback.core.ConsoleAppender">
    //        <encoder>
    //            <pattern>%d{yyyy-MM-dd'T'HH:mm:ss} [%t] %-5level %logger{50}:%method:%line - %msg%n </pattern>
    //        </encoder>
    //    </appender>
    //
    //    <logger name="WARSZTATY.Warsztat_7_LOGOWANIE.P5_Logowanie_LOGBAG_Console_cz1.logger1" level="debug" additivity="false">
    //        <appender-ref ref="CONSOLE2"/>
    //    </logger>
    //
    //    <logger name="WARSZTATY.Warsztat_7_LOGOWANIE.P5_Logowanie_LOGBAG_Console_cz1.logger2" level="trade" additivity="false">
    //        <appender-ref ref="CONSOLE2"/>
    //    </logger>
    //
    //
    //<!--od tego co tu wpiszemy będzie zależeć, z jakim poziomem logowania uruchomi się aplikacja-->
    //    <root level="info">
    //<!--        tu natomiast podajemy gdzie to ma byc logowane w naszym przypadku na konsole-->
    //<!--        <appender-ref ref="CONSOLE"/>-->
    //        <appender-ref ref="CONSOLE2"/>
    //    </root>
    //
    //</configuration>
}
