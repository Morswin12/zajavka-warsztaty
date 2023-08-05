package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P3_Testy_JUnit_Pierwsze_testy_w_Java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        // Konwencja: given, when, then
        //  - given - dane wejściowe do testu
        int left = 8;
        int right = 5;
        Integer expected = 13;

        //  - when - co ten test faktycznie robi
        Integer result = Calculator.add(left, right);

        //  - then - co jest spo
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testSubstract() {
        // Konwencja: given, when, then
        //  - given - dane wejściowe do testu
        int left = 10;
        int right = 5;
        Integer expected = 5;

        //  - when - co ten test faktycznie robi
        Integer result = Calculator.substract(left, right);

        //  - then - co jest spo
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testMultiply() {
        // Konwencja: given, when, then
        //  - given - dane wejściowe do testu
        int left = 8;
        int right = 5;
        Integer expected = 40;

        //  - when - co ten test faktycznie robi
        Integer result = Calculator.multiply(left, right);

        //  - then - co jest spo
        Assertions.assertEquals(expected, result);
    }
    @Test
    void testDivide() {
        // Konwencja: given, when, then
        //  - given - dane wejściowe do testu
        int left = 10;
        int right = 5;
        Integer expected = 2;

        //  - when - co ten test faktycznie robi
        Integer result = Calculator.divide(left, right);

        //  - then - co jest spo
        Assertions.assertEquals(expected, result);
    }
}