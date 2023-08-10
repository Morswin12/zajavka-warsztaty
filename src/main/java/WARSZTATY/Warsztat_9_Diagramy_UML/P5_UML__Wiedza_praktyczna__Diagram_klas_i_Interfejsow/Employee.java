package WARSZTATY.Warsztat_9_Diagramy_UML.P5_UML__Wiedza_praktyczna__Diagram_klas_i_Interfejsow;

import java.math.BigDecimal;

public abstract class Employee {
    private static final String SALARY = "5999";

    public BigDecimal salary;

    protected String surname;

    Integer age;

    private String name;

    public Employee(final  Integer age, final String surname) {
        this.surname = surname;
        this.age = age;
    }

    public static BigDecimal expectedSalary() {
        return BigDecimal.valueOf(6900.20);
    }

    abstract String opinion();

    private void goToWork(String name, String surname) {
            }

    boolean satisfied(boolean force) {
        return force;
    }
}
