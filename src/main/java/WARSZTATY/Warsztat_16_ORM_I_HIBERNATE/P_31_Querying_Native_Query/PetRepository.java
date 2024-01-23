package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_31_Querying_Native_Query;

import org.hibernate.Session;

import java.util.Objects;

public class PetRepository {

    Pet insertData(final Pet pet) {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            System.out.println(" ##### BEFORE INSERT \n ----------------------------------");
            session.beginTransaction();
            session.persist(pet);
            session.getTransaction().commit();
            System.out.println(" ---------------------------------- \n ##### AFTER INSERT");
            return pet;
        }
    }
}
