package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P18_Zadanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Adam4", "Nowak2" , 34, 4500.00));
        employees.add(new Employee("Adam4", "Nowak2" , 56, 6500.00));
        employees.add(new Employee("Adam4", "Nowak2" , 23, 4500.00));
        employees.add(new Employee("Adam4", "Nowak" , 77, 7500.00));
        employees.add(new Employee("Adam3", "Nowak6" , 55, 4500.00));
        employees.add(new Employee("Adam6", "Nowak6" , 12, 8500.00));
        employees.add(new Employee("Adam7", "Nowak6" , 42, 3500.00));
        employees.add(new Employee("Adam8", "Nowak6" , 23, 3500.00));
        employees.add(new Employee("Adam", "Nowakd" , 55, 6500.00));
        employees.add(new Employee("Adam", "Nowakwe" , 66, 4000.00));

        System.out.println(employees);
        Collections.sort(employees);
        System.out.println(employees);
        Comparator<Employee> comparator = (o1, o2) -> {
            int i = o1.getName().compareTo(o2.getName());
            if (i == 0) {
                i += o2.getSurName().compareTo(o1.getSurName());
            }
            if (i == 0) {
                i += o1.getAge() - o2.getAge();
            }
            if (i == 0) {
                double i1 = o1.getSalary() - o2.getSalary();
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
        };

        employees.sort(comparator);
        System.out.println(employees);
    }
}
