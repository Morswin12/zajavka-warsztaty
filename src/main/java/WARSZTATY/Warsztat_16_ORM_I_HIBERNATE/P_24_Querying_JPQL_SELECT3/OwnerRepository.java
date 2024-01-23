package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_24_Querying_JPQL_SELECT3;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import org.hibernate.Session;

import java.util.*;

public class OwnerRepository {

    //-------------------------------------------------------------------------------------------
    //---- Film 24: -----------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------

    void saveTestData() {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();

            // toy creation and saving
            Toy toy1 = ExampleData.someToy1();
            Toy toy2 = ExampleData.someToy2();
            Toy toy3 = ExampleData.someToy3();
            Toy toy4 = ExampleData.someToy4();
            session.persist(toy1);
            session.persist(toy2);
            session.persist(toy3);
            session.persist(toy4);

            // Pet creation and saving
            Pet pet1 = ExampleData.somePet1();
            Pet pet2 = ExampleData.somePet2();
            Pet pet3 = ExampleData.somePet3();
            Pet pet4 = ExampleData.somePet4();
            pet1.setToys(Set.of(toy1, toy2));
            pet2.setToys(Set.of(toy2, toy3));
            pet3.setToys(Set.of(toy1, toy2, toy3));
            pet4.setToys(Set.of(toy2, toy3, toy4));

            // Owner creation and saving
            Owner owner1 = ExampleData.someOwner1();
            Owner owner2 = ExampleData.someOwner2();
            owner1.setPets(Set.of(pet1, pet2));
            owner2.setPets(Set.of(pet3, pet4));
            owner1.getPets().forEach(pet -> pet.setOwner(owner1));
            owner2.getPets().forEach(pet -> pet.setOwner(owner2));
            session.persist(owner1);
            session.persist(owner2);
            session.getTransaction().commit();
        }
    }


    void selectExample14() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String select14 = """
                    SELECT ow FROM Owner ow
                    INNER JOIN FETCH ow.pets pt
                    INNER JOIN FETCH pt.toys ts
                    """;
            session.createQuery(select14, Owner.class)
                    .getResultList()
                    .forEach(entity -> System.out.println("#### Entity : " + entity));
            session.getTransaction().commit();
        }
    }


    void selectExample15() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String select15 = "SELECT COUNT(t.toyID) FROM Toy t";
            session.createQuery(select15, Long.class)
                    .getResultList()
                    .forEach(entity -> System.out.println("#### Entity : " + entity));
            session.getTransaction().commit();
        }
    }

    void selectExample16() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String select16 = """
                        SELECT new WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_24_Querying_JPQL_SELECT3.ToyStat
                        (
                        MIN(t.what),
                        SUM(t.toyID) / COUNT (t.toyID) + 4  
                        )
                        FROM Toy t
                    """;
            session.createQuery(select16, ToyStat.class)
                    .getResultList()
                    .forEach(entity -> System.out.println("#### Entity : " + entity));
            session.getTransaction().commit();
        }
    }


    //-------------------------------------------------------------------------------------------
    //---- Film 22: -----------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------

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
    //---- Film 23: -----------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------

    Optional<Owner> selectExample8(final String name) {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String selectExample8 = "SELECT ow FROM Owner ow WHERE ow.name = :name";
            Optional<Owner> owner = session.createQuery(selectExample8, Owner.class)
                    .setParameter("name", name)
//                    .uniqueResult() // mona też użyć tej metody, ale może ona zwrócić null, a ta niżej Optionala
                    .uniqueResultOptional();
            session.getTransaction().commit();
            return owner;
        }
    }

    void selectExample9() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String select9_1 = "SELECT ow FROM Owner ow INNER JOIN ow.pets pt";
            session.createQuery(select9_1, Owner.class)
                    .getResultList()
                    .forEach(entity -> System.out.println("#### Entity (z INNER JOIN) : " + entity));
            session.getTransaction().commit();
        }
    }

    void selectExample9_2() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String select9_2 = "SELECT ow FROM Owner ow JOIN FETCH ow.pets pt";
            session.createQuery(select9_2, Owner.class)
                    .getResultList()
                    .forEach(entity -> System.out.println("#### Entity (z JOIN FETCH): " + entity));
            session.getTransaction().commit();
        }
    }

    void selectExample10() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String select10_1 = "SELECT ow FROM Owner ow LEFT JOIN ow.pets pt";
            session.createQuery(select10_1, Owner.class)
                    .getResultList()
                    .forEach(entity -> System.out.println("#### Entity (z LEFT JOIN) : " + entity));
            session.getTransaction().commit();
        }
    }

    void selectExample10_2() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String select10_2 = "SELECT ow FROM Owner ow LEFT JOIN FETCH ow.pets pt";
            session.createQuery(select10_2, Owner.class)
                    .getResultList()
                    .forEach(entity -> System.out.println("#### Entity (z LEFT JOIN FETCH): " + entity));
            session.getTransaction().commit();
        }
    }

    void selectExample11() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String select11_1 = "SELECT ow FROM Owner ow RIGHT JOIN ow.pets pt";
            session.createQuery(select11_1, Owner.class)
                    .getResultList()
                    .forEach(entity -> System.out.println("#### Entity (z RIGHT JOIN) : " + entity));
            session.getTransaction().commit();
        }
    }

    void selectExample11_2() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String select11_2 = "SELECT ow FROM Owner ow RIGHT JOIN FETCH ow.pets pt";
            session.createQuery(select11_2, Owner.class)
                    .getResultList()
                    .forEach(entity -> System.out.println("#### Entity (z RIGHT JOIN FETCH): " + entity));
            session.getTransaction().commit();
        }
    }

    void selectExample12() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String select12_1 = "SELECT ow FROM Owner ow FULL JOIN ow.pets pt";
            session.createQuery(select12_1, Owner.class)
                    .getResultList()
                    .forEach(entity -> System.out.println("#### Entity (z FULL JOIN) : " + entity));
            session.getTransaction().commit();
        }
    }

    void selectExample12_2() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String select12_2 = "SELECT ow FROM Owner ow FULL JOIN FETCH ow.pets pt";
            session.createQuery(select12_2, Owner.class)
                    .getResultList()
                    .forEach(entity -> System.out.println("#### Entity (z FULL JOIN FETCH): " + entity));
            session.getTransaction().commit();
        }
    }

    void selectExample13() {
        try (Session session = HibernateUtil.getSession()) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String select13_1 = "SELECT ow.name, pet.name FROM Owner ow CROSS JOIN Pet pet";
            session.createQuery(select13_1, Object[].class)
                    .getResultList()
                    .forEach(entity -> System.out.println("#### Entity (z CROSS JOIN) : " + Arrays.asList(entity)));
            session.getTransaction().commit();
        }
    }


    //-------------------------------------------------------------------------------------------
    //---- Film 21: -----------------------------------------------------------------------------
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
