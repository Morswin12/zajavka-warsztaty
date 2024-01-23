package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_29_Querying_Encje_i_equals_oraz_hashCode;

import org.hibernate.Session;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CustomerRepository {

    Customer insertCustomer(final Customer customer) {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            session.persist(customer);
            session.getTransaction().commit();
            return customer;
        }
    }

    List<Customer> listCustomers() {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String query = "SELECT cust FROM Customer cust";
            List<Customer> customers = session.createQuery(query, Customer.class).list();
            session.getTransaction().commit();
            return customers;
        }
    }

    Optional<Customer> getCustomer(Integer customerId) {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session i null");
            }
            return Optional.ofNullable(session.find(Customer.class, customerId));
        }
    }

    void updateCustomer(Integer customerId, Address newAddress) {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session i null");
            }
            session.beginTransaction();
            Customer customer = session.find(Customer.class, customerId);
            customer.setAddress(newAddress);
            session.getTransaction().commit();
        }
    }

    void deleteCustomer(Integer customerId) {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session i null");
            }
            session.beginTransaction();
            session.remove(session.find(Customer.class, customerId));
            session.getTransaction().commit();
        }
    }

    void deleteAll() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session i null");
            }
            session.beginTransaction();
            String query = "select cust from Customer cust";
            List<Customer> listCustomersToRemove = session.createQuery(query, Customer.class).list();
            listCustomersToRemove.forEach(session::remove);
            session.getTransaction().commit();
        }
    }

    void testSession(final int customerId) {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session i null");
            }
            session.beginTransaction();

            Customer c1 = session.find(Customer.class, customerId);
            Customer c2 = session.find(Customer.class, customerId);

            System.out.println("c1 == c2: " + (c1 == c2));
            System.out.println("c1.equals(c2): " + c1.equals(c2));

            session.getTransaction().commit();
        }

    }
}
