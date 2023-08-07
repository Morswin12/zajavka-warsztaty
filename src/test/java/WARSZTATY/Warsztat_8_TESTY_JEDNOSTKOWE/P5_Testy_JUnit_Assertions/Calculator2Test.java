package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P5_Testy_JUnit_Assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Calculator2Test {

    // AssertJ - bardziej zaawansowana biblioteka do sprawdzania assencji

    private Calculator2 calculator;

    @BeforeEach
    void beforeEach() {
        calculator = new Calculator2();
    }


    //corner case
    @Test
    @DisplayName("Testing throws and them message")
    void testAdd() {
        // given
        String left = "5";
        String right = "4";
        String other = "asdf";

        // when,  then
//        Assertions.assertThrows(NumberFormatException.class, () -> Calculator2.add(left, right));
        Assertions.assertThrows(NumberFormatException.class, () -> Calculator2.add(left, other));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator2.add(left, other));
//        Assertions.assertThrows(NullPointerException.class, () -> Calculator2.add(left, other));
        NumberFormatException throwable = Assertions.assertThrows(NumberFormatException.class, () -> Calculator2.add(left, other));
        Assertions.assertEquals("For input string: \"" + other + "\"", throwable.getMessage());
    }
}
