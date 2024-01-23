package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_32_Querying_Criteria_API_cz1;

import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.ParameterExpression;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.query.Query;

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


    public void criteriaExample() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session i null");
            }
            session.beginTransaction();

            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Customer> criteriaQuery = criteriaBuilder.createQuery(Customer.class);
            Root<Customer> root = criteriaQuery.from(Customer.class);
            criteriaQuery.select(root);

            Query<Customer> query = session.createQuery(criteriaQuery);
            List<Customer> resultList = query.getResultList();
            resultList.forEach(entity -> System.out.println("### Entity: " + entity));

            session.getTransaction().commit();
        }
    }

    public void criteriaExampleZWhere() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session i null");
            }
            session.beginTransaction();

            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Customer> criteriaQuery = criteriaBuilder.createQuery(Customer.class);
            Root<Customer> root = criteriaQuery.from(Customer.class);
            //tworzymy parametr1, do którego później się odniesiemy w query.setParameter() poniżej, do podania where'a
            ParameterExpression<String> parameter1 = criteriaBuilder.parameter(String.class);
            criteriaQuery
                    .select(root)
                    // dodajemy where odnośnie do maila
                    .where(criteriaBuilder.equal(root.get("email"), parameter1));

            Query<Customer> query = session.createQuery(criteriaQuery);
            // tu podajemy maila, po którym będzie szukał
            query.setParameter(parameter1, "rysiu@wp.pl");

            List<Customer> resultList = query.getResultList();
            resultList.forEach(entity -> System.out.println("### Entity: " + entity));

            session.getTransaction().commit();
        }
    }

    public void criteriaExampleOtherSituations() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session i null");
            }
            session.beginTransaction();

            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Customer> criteriaQuery = criteriaBuilder.createQuery(Customer.class);
            Root<Customer> root = criteriaQuery.from(Customer.class);
            ParameterExpression<String> parameter1 = criteriaBuilder.parameter(String.class);
            criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("email"), parameter1));

            // poniżej inne szczegółowanie zapytań:
            //      gt -> greater-than
            criteriaQuery.select(root).where(criteriaBuilder.gt(root.get("salary"), 1000));
            //      ge -> greater-than-or-equals
            criteriaQuery.select(root).where(criteriaBuilder.ge(root.get("salary"), 1000));
            //      lt -> less-than
            criteriaQuery.select(root).where(criteriaBuilder.lt(root.get("salary"), 1000));
            //      le -> less-than-or-equals
            criteriaQuery.select(root).where(criteriaBuilder.le(root.get("salary"), 1000));
            //      like
            criteriaQuery.select(root).where(criteriaBuilder.like(root.get("productName"), "%bascet%"));
            //      between
            criteriaQuery.select(root).where(criteriaBuilder.between(root.get("itemPrice"), 100, 120));
            //      in
            criteriaQuery.select(root).where(root.get("itemName").in("Tuna", "Ham", "Cheese"));
            //      and
            criteriaQuery.select(root).where(criteriaBuilder.and(criteriaBuilder
                            //  z like
                            .like(root.get("email"), "%r%"), criteriaBuilder.isNotNull(root.get("phone")))
                    )
                    // z sortowaniem po telefonie
                    .orderBy(criteriaBuilder.desc(root.get("phone")));
            //      or
            criteriaQuery.select(root).where(criteriaBuilder.or());
            //      not
//            criteriaQuery.select(root).where(criteriaBuilder.not());

            Query<Customer> query = session.createQuery(criteriaQuery);
            query.setParameter(parameter1, "rysiu@wp.pl");

            List<Customer> resultList = query.getResultList();
            resultList.forEach(entity -> System.out.println("### Entity: " + entity));

            session.getTransaction().commit();
        }
    }

    public void criteriaExampleSetFirstSetMaxResult() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session i null");
            }
            session.beginTransaction();

            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Customer> criteriaQuery = criteriaBuilder.createQuery(Customer.class);
            Root<Customer> root = criteriaQuery.from(Customer.class);
            criteriaQuery.select(root);

            Query<Customer> query = session.createQuery(criteriaQuery);

            // setFirstResult
            query.setFirstResult(1);
            // setMaxResults
            query.setMaxResults(2);

            // drukuje pojedynczy rezultat lub null
            query.uniqueResult();
            // drukuje pojedynczy rezultat lub rzuca wyjątek, gdy jest więcej wyników lub nie ma żadnego
            query.getSingleResult();

            List<Customer> resultList = query.getResultList();
            resultList.forEach(entity -> System.out.println("### Entity: " + entity));

            session.getTransaction().commit();
        }

        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();

            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            // Użyjemy tu Interfejsu Tuple, który opakowuje naszych Customer'ów trochę jak lista ?
            CriteriaQuery<Tuple> criteriaQuery = criteriaBuilder.createQuery(Tuple.class);
            // ale odnosimy sie do Customer'a
            Root<Customer> root = criteriaQuery.from(Customer.class);
            // Użyjemy multiselecta
            criteriaQuery.multiselect(root.get("name"));
            // możemy także wykonać distinct
            criteriaQuery.distinct(true);

            Query<Tuple> query = session.createQuery(criteriaQuery);
            List<Tuple> resultList = query.getResultList();

            // W przypadku Tuple musimy dodać np.: .get(0), aby pobrać pierwszą pozycję tu "name"
            resultList.forEach(entity -> System.out.println("### ENTITY: " + entity.get(0)));

            session.getTransaction().commit();
        }
    }

    public void criteriaExampleEliminacja_Tuple() {
    }

    public void criteriaExample_Sortowanie() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session i null");
            }
            session.beginTransaction();

            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Customer> criteriaQuery = criteriaBuilder.createQuery(Customer.class);
            Root<Customer> root = criteriaQuery.from(Customer.class);
            criteriaQuery.select(root);
            criteriaQuery.orderBy(
                    criteriaBuilder.asc(root.get("name")),
                    criteriaBuilder.desc(root.get("phone"))
            );
            Query<Customer> query = session.createQuery(criteriaQuery);

            // setFirstResult
            query.setFirstResult(1);
            // setMaxResults
            query.setMaxResults(2);

            // drukuje pojedynczy rezultat lub null
            query.uniqueResult();
            // drukuje pojedynczy rezultat lub rzuca wyjątek, gdy jest więcej wyników lub nie ma żadnego
            query.getSingleResult();

            List<Customer> resultList = query.getResultList();
            resultList.forEach(entity -> System.out.println("### Entity: " + entity));

            session.getTransaction().commit();
        }
    }
}

