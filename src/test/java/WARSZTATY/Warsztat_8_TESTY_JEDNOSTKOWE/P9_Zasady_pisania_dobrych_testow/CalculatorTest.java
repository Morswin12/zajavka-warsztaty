package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P9_Zasady_pisania_dobrych_testow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void beforeEach() {
        calculator = new Calculator(() -> 0);
    }

    @Test
    void add() {
        //give
        int a = 4;
        int b = 9;
        int expected = 13;

        // when
        int result = calculator.add(a, b);
        System.out.println(result);

        // then
        Assertions.assertEquals(expected, result);
    }
}