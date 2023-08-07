package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P5_Testy_JUnit_Assertions;

public class Calculator2 {

    public static int add(String left, String right) {

        return Integer.parseInt(left) + Integer.parseInt(right);
    }
    public static int multiply(int left, int right) {
        return left * right;
    }

    public static int subtract(int left, int right) {
        return left - right;
    }

    public static int divide(int left, int right) {
        return left / right;
    }
}
