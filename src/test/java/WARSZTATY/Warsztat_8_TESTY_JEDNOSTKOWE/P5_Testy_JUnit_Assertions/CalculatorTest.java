package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P5_Testy_JUnit_Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void beforeEach() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Testing few kind of Assertion like: True, False, Equals, NotEquals")
    void assertionsTest() {
        int a = 1;
        int b = 1;
        int c = 2;
//        Assertions.assertEquals(a, b, createMessage(a, b));
//        Assertions.assertEquals(a, c, createMessage(a, c));
        Assertions.assertEquals(a, b, () -> createMessage(a, c));
//            Assertions.assertEquals(1,2);
//        Assertions.assertNotEquals(a, c, createMessage(a, c));
        Assertions.assertNotEquals(a, c, () -> createMessage(a, c));
//        Assertions.assertTrue(false);
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
        Assertions.assertNotNull(2);
        Assertions.assertNull(null);
    }

    private String createMessage(int param1, int param2) {
        System.out.println("Message creation: " + param1 + " is not equals to: " + param2);
        return "Failure messageeeeeeeeeeeeee!!!!" + param1 + " is NOT equals to: " + param2;
    }

    @Test
    @DisplayName("Testing few kind of Assertion like: Null, NotNull")

    void testCalculator() {
        // given
        int a = 4;
        int b = 7;

        // when
        Integer result1 = Calculator.add(a, b);
        Integer result2 = Calculator.subtract(a, b);
        Integer result3 = Calculator.multiply(a, b);
        Integer result4 = Calculator.divide(a, b);

        // then
        Assertions.assertNotNull(result1);
        Assertions.assertNotNull(result2);
        Assertions.assertNotNull(result3);
        Assertions.assertNotNull(result4);
        Assertions.assertEquals(11, result1);
        Assertions.assertEquals(-3, result2);
        Assertions.assertEquals(28, result3);
        Assertions.assertEquals(0, result4);
    }


    @Test
    @DisplayName("Testing AssertionAll where we can check few of different Equals assertion")
    void testCalculator2() {
        Assertions.assertAll(
                () -> Assertions.assertEquals("test1", "test1", () -> "my custom message1"),
                () -> Assertions.assertEquals("test2", "test2", () -> "my custom message2"),
//                () -> Assertions.assertEquals("test1", "test3", () -> "my custom message3"),
                () -> Assertions.assertEquals("test1", "test1", () -> "my custom message4")
        );
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
