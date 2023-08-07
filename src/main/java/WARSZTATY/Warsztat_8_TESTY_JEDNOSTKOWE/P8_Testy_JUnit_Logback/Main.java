package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P8_Testy_JUnit_Logback;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(1, 3);
    }
}
