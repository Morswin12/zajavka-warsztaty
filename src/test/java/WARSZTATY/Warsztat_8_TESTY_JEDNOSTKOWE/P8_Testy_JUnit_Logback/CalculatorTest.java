package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P8_Testy_JUnit_Logback;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calculator;
    @BeforeEach
    void beforeEach() {calculator = new Calculator();}

    @Test
    void add() {
        // given
        int left = 7;
        int right = 5;
        int exception = 12;

        // when
        int result = calculator.add(left, right);

        //then
        Assertions.assertEquals(exception, result);
    }
}