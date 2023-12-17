package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P13_15_Hibernate_Relacje.P15_Hibernate_Relacje_Many_To_Many;

import WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P13_15_Hibernate_Relacje.HibernateUtil;
import org.hibernate.Session;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class EmployeeRepository {

    List<Employee> insertData(final List<Employee> employees) {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            employees.forEach(object -> {
                System.out.println("#### BEFORE");
                session.persist(object);
                System.out.println("#### AFTER");
            });
            session.getTransaction().commit();
            return employees;
        }
    }


    List<Employee> listEmployees() {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String query = "SELECT employee FROM Employee employee";
            List<Employee> employees = session.createQuery(query, Employee.class).list();
            session.getTransaction().commit();
            return employees;
        }
    }


    Optional<Employee> getEmployee(Integer employeeId) {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            return Optional.ofNullable(session.find(Employee.class, employeeId));
        }
    }


    void updateEmployee(Integer employeeId, Project newProject) {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            Employee employee = session.find(Employee.class, employeeId);
            employee.getProjects().add(newProject);
            session.getTransaction().commit();
        }
    }


    void deleteEmployee(Integer employeeId) {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            session.remove(session.find(Employee.class, employeeId));
            session.getTransaction().commit();
        }

    }

    void deleteAll() {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String query = "SELECT employee from Employee employee";
            session.createQuery(query, Employee.class).list().forEach(session::remove);
            session.getTransaction().commit();
        }

    }




}
