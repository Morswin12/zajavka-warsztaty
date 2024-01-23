package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_25_Querying_JPQL_Named_Query;

import org.hibernate.Session;

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

}
