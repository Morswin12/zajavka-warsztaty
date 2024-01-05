package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_22_Querying_JPQL_SELECT1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import org.hibernate.Session;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class OwnerRepository {

    List<Owner> findAllHQL() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String query = "FROM Owner"; // najkrótszy możliwy zapis HQL, nie musimy dodawać słowa select *
            List<Owner> owners = session.createQuery(query, Owner.class).list();
            session.getTransaction().commit();
            return owners;
        }
    }

    // powtórzmy to, co wyżej ze zmianami w selectach (przy czym pierwszy to kopia
    List<Owner> selectExample1() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String query = "FROM Owner"; // najkrótszy możliwy zapis HQL, nie musimy dodawać słowa select *
            List<Owner> owners = session.createQuery(query, Owner.class).list();
            session.getTransaction().commit();
            return owners;
        }
    }

    List<Owner> selectExample2() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String selectExample2 = "SELECT ow FROM Owner ow";
//            String selectExample2 = "SELECT ow FROM Owner as ow"; // czy damy 'as', czy nie to i tak zadziała
            List<Owner> owners = session.createQuery(selectExample2, Owner.class)
                    .getResultList();
            session.getTransaction().commit();
            return owners;
        }
    }

    List<Object[]> selectExample3() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String selectExample3 = "SELECT ow.id, ow.name FROM Owner ow";
            List<Object[]> owners = session.createQuery(selectExample3, Object[].class)
                    .getResultList();
            session.getTransaction().commit();
            return owners;
        }
    }

    List<OwnerTemp> selectExample4() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String selectExample4 = "SELECT new WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_22_Querying_JPQL_SELECT1.OwnerTemp(ow.id, ow.name) FROM Owner ow";
            List<OwnerTemp> owners = session.createQuery(selectExample4, OwnerTemp.class)
                    .getResultList();
            session.getTransaction().commit();
            return owners;
        }
    }

    List<Owner> selectExample5() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
//            String selectExample5 = "SELECT ow FROM Owner ow WHERE ow.email = :email";
            String selectExample5 = "SELECT ow FROM Owner ow WHERE ow.email LIKE :email";   // zamiast '=' jak wyżej
            // możemy użyć 'LIKE'
            List<Owner> owners = session
                    .createQuery(selectExample5, Owner.class)
                    .setParameter("email", "rysiu@wp.pl")
                    .getResultList();
            session.getTransaction().commit();
            return owners;
        }
    }

    List<Owner> selectExample6() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String selectExample6 = "SELECT ow FROM Owner ow ORDER BY ow.email ASC, ow.name DESC";
            List<Owner> owners = session
                    .createQuery(selectExample6, Owner.class)
                    .getResultList();
            session.getTransaction().commit();
            return owners;
        }
    }

    List<Owner> selectExample7() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String selectExample7 = "SELECT ow FROM Owner ow ORDER BY ow.email DESC";
            List<Owner> owners = session
                    .createQuery(selectExample7, Owner.class)
                    .getResultList();
            session.getTransaction().commit();
            return owners;
        }
    }

    List<Owner> selectExample7_a() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String selectExample7_1 = "SELECT ow FROM Owner ow ORDER BY ow.email DESC";
            List<Owner> owners = session
                    .createQuery(selectExample7_1, Owner.class)
                    .setFirstResult(2)
                    .getResultList();
            session.getTransaction().commit();
            return owners;
        }
    }

    List<Owner> selectExample7_b() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String selectExample7_2 = "SELECT ow FROM Owner ow ORDER BY ow.email DESC";
            List<Owner> owners = session
                    .createQuery(selectExample7_2, Owner.class)
                    .setMaxResults(2)
                    .getResultList();
            session.getTransaction().commit();
            return owners;
        }
    }

    List<Owner> selectExample7_c() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String selectExample7_3 = "SELECT ow FROM Owner ow ORDER BY ow.email DESC";
            List<Owner> owners = session
                    .createQuery(selectExample7_3, Owner.class)
                    .setFirstResult(2)
                    .setMaxResults(2)
                    .getResultList();
            session.getTransaction().commit();
            return owners;
        }
    }

    //-------------------------------------------------------------------------------------------

    List<Owner> listOwners() {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String query = "SELECT owner2 FROM Owner owner2";
            List<Owner> owners = session.createQuery(query, Owner.class).list();
            session.getTransaction().commit();
            return owners;
        }

    }


    Owner insertData(final Owner owner, final Set<Pet> pets) {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            owner.setPets(pets);
            pets.forEach(pet -> pet.setOwner(owner));
            session.persist(owner);
            session.getTransaction().commit();
            return owner;
        }
    }

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
            System.out.println(owner.getPets());
            System.out.println(" ---------------------------------- \n ### AFTER GET PETS");

            return Optional.of(owner);
        }
    }

    void updateOwner(Integer ownerId, Pet newPet) {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            Owner owner = session.find(Owner.class, ownerId);
//            Pet newPet = Pet.builder().name(newPet.getName()).breed(newPet.getBreed()).owner2(owner2).build();
            Set<Pet> pet = owner.getPets();
            pet.add(newPet);
            session.getTransaction().commit();
        }
    }

    void deleteOwner(Integer ownerId) {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            session.remove(session.find(Owner.class, ownerId));
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
            System.out.println("###BEFORE DELETE ALL \n ----------------------------------");
            session.beginTransaction();
            String query = "SELECT owner2 from Owner owner2";
            session.createQuery(query, Owner.class).list().forEach(session::remove);
            session.getTransaction().commit();
            System.out.println(" ---------------------------------- \n ### AFTER DELETE ALL");
        }

    }

    void orphanRemovalExample(final Integer ownerID) {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();

            Owner owner = session.find(Owner.class, ownerID);
            Pet petToRemove = owner.getPets().stream().findAny().orElseThrow();
            owner.removePet(petToRemove);
            session.merge(owner);
            session.getTransaction().commit();

        }
    }

    int insertHQL() {
        EntityManager entityManager = null;
        EntityTransaction transaction = null;
        int result;

        try {
            entityManager = HibernateUtil.getSession();
            if (Objects.isNull(entityManager)) {
                throw new RuntimeException("EntityManager is null");
            }
            transaction = entityManager.getTransaction();
            transaction.begin();
            String hql = """
                    INSERT Owner (name, surname, phone, email)
                         VALUES ('Romek', 'Zabacki', '+48 1234456789', 'rz@gmail.pl')
                    """;
            Query query = entityManager.createQuery(hql);
            result = query.executeUpdate();
            transaction.commit();
            entityManager.close();
        } catch (Exception e) {
            if (Objects.nonNull(transaction) && transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        } finally {
            if (Objects.nonNull(entityManager)) {
                entityManager.close();
            }
        }
        return result;
    }


    int updateHQL(final String oldEmail, final String newPhone, final String newEmail) {
        EntityManager entityManager = null;
        EntityTransaction transaction = null;
        int result;

        try {
            entityManager = HibernateUtil.getSession();
            if (Objects.isNull(entityManager)) {
                throw new RuntimeException("EntityManager is null");
            }
            transaction = entityManager.getTransaction();
            transaction.begin();


            String hql = """
                    UPDATE Owner ow 
                         SET ow.phone = :newPhone, ow.email = :newEmail
                         WHERE ow.email = :oldEmail
                    """;
            Query query = entityManager.createQuery(hql)
                    .setParameter("oldEmail", oldEmail)
                    .setParameter("newPhone", newPhone)
                    .setParameter("newEmail", newEmail);


            result = query.executeUpdate();
            transaction.commit();
            entityManager.close();
        } catch (Exception e) {
            if (Objects.nonNull(transaction) && transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        } finally {
            if (Objects.nonNull(entityManager)) {
                entityManager.close();
            }
        }
        return result;
    }

    int deleteHQL(final String email) {
        EntityManager entityManager = null;
        EntityTransaction transaction = null;
        int result;
        try {
            entityManager = HibernateUtil.getSession();
            if (Objects.isNull(entityManager)) {
                throw new RuntimeException("entityManager is null");
            }
            transaction = entityManager.getTransaction();
            transaction.begin();

            String hgl = """
                        DELETE FROM Owner ow
                        WHERE ow.email = :email         
                    """;

            Query query = entityManager.createQuery(hgl)
                    .setParameter("email", email);

            result = query.executeUpdate();
            transaction.commit();
            entityManager.close();
        } catch (Exception e) {
            if (Objects.nonNull(transaction) && transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        } finally {
            if (Objects.nonNull(entityManager)) {
                entityManager.close();
            }
        }
        return result;
    }
}
