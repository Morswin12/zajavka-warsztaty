package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_31_Querying_Native_Query;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OwnerRepository {

    //-------------------------------------------------------------------------------------------
    //---- Film 25: -----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------

    void selectExampleNamedQuery(final String email) {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
           session.createNamedQuery("Owner.findOwnerByEmail", Owner.class)
                   .setParameter("email", email)
                    .getResultList()
                    .forEach(entity -> System.out.println("#### Entity : " + entity));
            session.getTransaction().commit();
        }
    }

    //-------------------------------------------------------------------------------------------
    //---- Film 26: -----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------

    Optional<Owner> getOwner(Integer ownerId) {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            System.out.println("###BEFORE GET OWNER \n ----------------------------------");
            Owner owner = session.find(Owner.class, ownerId);
            System.out.println(" ---------------------------------- \n ### AFTER GET OWNER");
            System.out.println("###BEFORE GET PETS \n ----------------------------------");
            System.out.println(owner);
//            System.out.println(owner.getPets());
            System.out.println(" ---------------------------------- \n ### AFTER GET PETS");

            return Optional.of(owner);
        }
    }


    //-------------------------------------------------------------------------------------------
    //---- Film 31: -----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------

    void nativeQueryExample() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();

            String sql = "SELECT * FROM Owner";
            NativeQuery<Owner> nativeQuery = session.createNativeQuery(sql, Owner.class);
            List<Owner> list = nativeQuery.list();
            list.forEach(entity -> System.out.println("Entity: " + entity));

            session.getTransaction().commit();
        }
    }


    void nativeQueryExample2() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();

            String sql = "SELECT * FROM Owner";
            NativeQuery<Owner> nativeQuery = session.getNamedNativeQuery("Owner.findAllNative");
            List<Owner> list = nativeQuery.list();
            list.forEach(entity -> System.out.println("Entity: " + entity));

            session.getTransaction().commit();
        }
    }
}
