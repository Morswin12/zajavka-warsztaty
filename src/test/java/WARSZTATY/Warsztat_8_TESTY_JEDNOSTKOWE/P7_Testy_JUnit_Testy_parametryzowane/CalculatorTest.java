package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P7_Testy_JUnit_Testy_parametryzowane;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {


    @BeforeEach
    void beforeEach() {
        Calculator calculator = new Calculator();
    }

       @Test
    void testAdd() {
        // given
        int left = 5;
        int right = 7;
        int expected = 12;

        // when
        int result = Calculator.add(left, right);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testSubtract() {
        // given
        int left = 5;
        int right = 7;
        int expected = -2;

        // when
        int result = Calculator.subtract(left, right);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testMultiply() {
        // given
        int left = 5;
        int right = 7;
        int expected = 35;

        // when
        int result = Calculator.multiply(left, right);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    @Disabled("Explain here why are you ignored this test :(")
    void testDivide() {
        // given
        int left = 10;
        int right = 2;
        int expected = 5;

        // when
        int result = Calculator.divide(left, right);

        //then
        Assertions.assertEquals(expected, result);
    }

}
