package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P8_Testy_JUnit_Logback;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calculator {

    public int add(int left, int right) {
        log.debug("some debug message");
        log.info("some info message");
        log.warn("some warn message");
        log.error("some error message");
        return left + right;
    }
}
