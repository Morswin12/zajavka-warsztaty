package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_21_Querying_JPQL_Modyfikacja_danych;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

import java.util.Objects;

public class OwnerRepository {

//    Owner insertData(final Owner owner, final Set<Pet> pets) {
//        try (
//                Session session = HibernateUtil.getSession()
//        ) {
//            if (Objects.isNull(session)) {
//                throw new RuntimeException("Session is null");
//            }
//            System.out.println("###BEFORE INSERT \n ----------------------------------");
//            session.beginTransaction();
//            owner.setPets(pets);
//            pets.forEach(pet -> pet.setOwner(owner));
//            session.persist(owner);
//            session.getTransaction().commit();
//            System.out.println(" ---------------------------------- \n ### AFTER INSERT");
//            return owner;
//        }
//    }
//
//    List<Owner> listOwners() {
//        try (
//                Session session = HibernateUtil.getSession()
//        ) {
//            if (Objects.isNull(session)) {
//                throw new RuntimeException("Session is null");
//            }
//            session.beginTransaction();
//            String query = "SELECT owner2 FROM Owner owner2";
//            List<Owner> owners = session.createQuery(query, Owner.class).list();
//            session.getTransaction().commit();
//            return owners;
//        }
//
//    }
//
//    Optional<Owner> getOwner(Integer ownerId) {
//        try (
//                Session session = HibernateUtil.getSession()
//        ) {
//            if (Objects.isNull(session)) {
//                throw new RuntimeException("Session is null");
//            }
//            System.out.println("###BEFORE GET OWNER \n ----------------------------------");
//            Owner owner = session.find(Owner.class, ownerId);
//            System.out.println(" ---------------------------------- \n ### AFTER GET OWNER");
//            System.out.println("###BEFORE GET PETS \n ----------------------------------");
//            System.out.println(owner.getPets());
//            System.out.println(" ---------------------------------- \n ### AFTER GET PETS");
//
//            return Optional.of(owner);
//        }
//    }
//
//    void updateOwner(Integer ownerId, Pet newPet) {
//        try (
//                Session session = HibernateUtil.getSession()
//        ) {
//            if (Objects.isNull(session)) {
//                throw new RuntimeException("Session is null");
//            }
//            session.beginTransaction();
//            Owner owner = session.find(Owner.class, ownerId);
////            Pet newPet = Pet.builder().name(newPet.getName()).breed(newPet.getBreed()).owner2(owner2).build();
//            Set<Pet> pet = owner.getPets();
//            pet.add(newPet);
//            session.getTransaction().commit();
//        }
//    }
//
//    void deleteOwner(Integer ownerId) {
//        try (
//                Session session = HibernateUtil.getSession()
//        ) {
//            if (Objects.isNull(session)) {
//                throw new RuntimeException("Session is null");
//            }
//            session.beginTransaction();
//            session.remove(session.find(Owner.class, ownerId));
//            session.getTransaction().commit();
//        }
//
//    }
//
//    void deleteAll() {
//        try (
//                Session session = HibernateUtil.getSession()
//        ) {
//            if (Objects.isNull(session)) {
//                throw new RuntimeException("Session is null");
//            }
//            System.out.println("###BEFORE DELETE ALL \n ----------------------------------");
//            session.beginTransaction();
//            String query = "SELECT owner2 from Owner owner2";
//            session.createQuery(query, Owner.class).list().forEach(session::remove);
//            session.getTransaction().commit();
//            System.out.println(" ---------------------------------- \n ### AFTER DELETE ALL");
//        }
//
//    }
//
//    void orphanRemovalExample(final Integer ownerID) {
//        try (
//                Session session = HibernateUtil.getSession()
//        ) {
//            if (Objects.isNull(session)) {
//                throw new RuntimeException("Session is null");
//            }
//            session.beginTransaction();
//
//            Owner owner = session.find(Owner.class, ownerID);
//            Pet petToRemove = owner.getPets().stream().findAny().orElseThrow();
//            owner.removePet(petToRemove);
//            session.merge(owner);
//            session.getTransaction().commit();
//
//        }
//    }

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
