package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P10_Hibernate_CRUD_podstawy;

import org.hibernate.Session;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class EmployeeRepository {

    EmployeeEntity insert(final EmployeeEntity employee) {
        try (Session session = HibernateUtil.getSession()) {
            Objects.requireNonNull(session); // alternatywa do if-a,  który jest niżej
//            if (Objects.isNull(session)) {
//                throw new RuntimeException("Session is null");
//            }
            session.beginTransaction();
            session.persist(employee);
            session.getTransaction().commit();

            return employee;
        }

    }


    List<EmployeeEntity> listEmployee() {
        try (Session session = HibernateUtil.getSession()) {
            Objects.requireNonNull(session);
            session.beginTransaction();
            String query = "select emp from EmployeeEntity emp";
            List<EmployeeEntity> employes = session.createQuery(query, EmployeeEntity.class).list();
            session.getTransaction().commit();
            return employes;
        }
    }

    Optional<EmployeeEntity> getEmployee(final Integer empoyeeId) {
        try (Session session = HibernateUtil.getSession()) {
            Objects.requireNonNull(session);
            session.beginTransaction();
            Optional<EmployeeEntity> employee = Optional.ofNullable(session.find(EmployeeEntity.class, empoyeeId));
            session.getTransaction().commit();

            return employee;
        }
    }


    void updateEmployee(Integer employeeId, BigDecimal newSalary) {
        try (Session session = HibernateUtil.getSession()) {
            Objects.requireNonNull(session);
            session.beginTransaction();
            EmployeeEntity employee = session.find(EmployeeEntity.class, employeeId);
            employee.setSalary(newSalary);
            session.getTransaction().commit();
        }
    }

    void deleteEmployee(Integer employeeId) {
        try (Session session = HibernateUtil.getSession()) {
            Objects.requireNonNull(session);
            session.beginTransaction();
            session.remove(session.find(EmployeeEntity.class, employeeId));
            session.getTransaction().commit();
        }
    }

    public void deleteAll() {
        try (Session session = HibernateUtil.getSession()) {
            Objects.requireNonNull(session);
            session.beginTransaction();
            String query = "select emp from EmployeeEntity emp";
            session.createQuery(query, EmployeeEntity.class).list().forEach(session::remove);
            session.getTransaction().commit();
        }
    }
}

