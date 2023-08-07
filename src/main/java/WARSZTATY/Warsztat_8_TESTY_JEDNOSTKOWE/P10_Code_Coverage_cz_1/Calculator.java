package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P10_Code_Coverage_cz_1;

public class Calculator {
    public int add(int a, int b) {
        System.out.println("add");
        if (a < 0) {
            System.out.println("less than 0");
        }
        return a + b;
    }

    public int subtract(int a, int b) {
        System.out.println("subtract");
        return a - b;
    }
    public int multiply(int a, int b) {
        System.out.println("multiply");
        return a * b;
    }
    public int divide(int a, int b) {
        System.out.println("divide");

        return a / b;
    }
}
