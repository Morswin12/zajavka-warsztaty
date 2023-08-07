package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P4_Testy_JUnit_Adnotacje_Before_i_After;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    @DisplayName("Testing method which tests adding behaviour")
    void testAdd() {
        //given
        int a = 5;
        int b = 4;
        Integer excepted = 9;

        // when
        Integer result = Calculator.add(a, b);

        // then
        Assertions.assertEquals(excepted, result);
    }

    @Test
    @DisplayName("Testing method which tests multiplying behaviour")
    void testMultiply() {
        //given
        int a = 5;
        int b = 4;
        Integer excepted = 20;

        // when
        Integer result = Calculator.multiply(a, b);

        // then
        Assertions.assertEquals(excepted, result);

    }

    @Test
    void testSubtract() {
        //given
        int a = 5;
        int b = 4;
        Integer excepted = 1;

        // when
        Integer result = Calculator.subtract(a, b);

        // then
        Assertions.assertEquals(excepted, result);

    }

    @Test
    void testDivide() {
        //given
        int a = 5;
        int b = 4;
        Integer excepted = 1;

        // when
        Integer result = Calculator.divide(a, b);

        // then
        Assertions.assertEquals(excepted, result);

    }
}