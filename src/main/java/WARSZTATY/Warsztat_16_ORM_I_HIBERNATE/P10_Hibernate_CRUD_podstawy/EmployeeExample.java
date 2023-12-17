package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P10_Hibernate_CRUD_podstawy;

import java.math.BigDecimal;

public class EmployeeExample {

    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();

        employeeRepository.deleteAll();

        EmployeeEntity employee1 = employeeRepository.insert(EmployeeData.someEmployee1());
        EmployeeEntity employee2 = employeeRepository.insert(EmployeeData.someEmployee2());
        EmployeeEntity employee3 = employeeRepository.insert(EmployeeData.someEmployee3());

        System.out.println("###Employee1: " + employeeRepository.getEmployee(employee1.getEmployeeID()));
        System.out.println("###Employee2: " + employeeRepository.getEmployee(employee2.getEmployeeID()));

        employeeRepository.updateEmployee(employee3.getEmployeeID(), new BigDecimal(2345.67));
        System.out.println("###Employee3 after update: " + employeeRepository.getEmployee(employee3.getEmployeeID()));

        employeeRepository.listEmployee()
                .forEach(employee -> System.out.println("###Employee: " + employee));

        employeeRepository.deleteEmployee(employee2.getEmployeeID());

        employeeRepository.listEmployee()
                .forEach(employee -> System.out.println("###Employee: " + employee));

        HibernateUtil.closeSessionFactory();
    }
}
