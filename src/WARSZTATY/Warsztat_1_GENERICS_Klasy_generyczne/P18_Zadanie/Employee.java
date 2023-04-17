package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P18_Zadanie;

import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee> {
    private String name;
    private String surName;
    private int age;
    private Double salary;

    public Employee(String name, String surName, int age, Double salary) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        int i = this.name.compareTo(o.name);
        if (i == 0) {
            i += o.surName.compareTo(this.surName);
        }
        if (i == 0) {
            i += this.age - o.age;
        }
        if (i == 0) {
            double i1 = this.salary - o.salary;
            int temporary;
            if (i1 == 0.00) {
                temporary = 0;
            } else if (i1 > 0) {
                temporary = 1;
            } else {
                temporary = -1;
            }
            i += temporary;
        }
        return i;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        int i = o1.name.compareTo(o2.name);
        if (i == 0) {
            i += o2.surName.compareTo(o1.surName);
        }
        if (i == 0) {
            i += o1.age - o2.age;
        }
        if (i == 0) {
            double i1 = o1.salary - o2.salary;
            int temporary;
            if (i1 == 0.00) {
                temporary = 0;
            } else if (i1 > 0) {
                temporary = 1;
            } else {
                temporary = -1;
            }
            i += temporary;
        }

        return i;
    }

    @Override
    public String toString() {
        return name + "_" + surName + '_' + age + "_salary=" + salary;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }
}