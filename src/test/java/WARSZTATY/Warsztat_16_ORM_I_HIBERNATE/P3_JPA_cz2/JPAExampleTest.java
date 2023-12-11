package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P3_JPA_cz2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JPAExampleTest {

    @Test
    void createAndUpdatePersonTest() {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("goroPersistenceExample"); // nazwa z persistence.xml

        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();

            String name = "Stefan";
            int age = 18;

            createPerson(entityManager, name, age);

            List<Person> allPeople = getAllPeople(entityManager);

            int newAge = 30;
            Person person = allPeople.get(0);

            updateAge(entityManager, person, newAge);

            Assertions.assertEquals(1, allPeople.size());
            Assertions.assertEquals(30, allPeople.get(0).getAge());

            entityManager.close();
        } finally {
            entityManagerFactory.close();
        }
    }

    private void updateAge(EntityManager entityManager, Person person, int newAge) {
        entityManager.getTransaction().begin();

        person.setAge(newAge);

        entityManager.getTransaction().commit();
    }

    private List<Person> getAllPeople(EntityManager entityManager) {
        entityManager.getTransaction().begin();

        // tworzymy zapytanie do bazy danych i przypisujemy wynik do listy Person'ów
        String select = "SELECT p FROM Person p";
        Query query = entityManager.createQuery(select);
        List<Person> resultList = query.getResultList();

        entityManager.getTransaction().commit();
        return resultList;
    }

    private void createPerson(EntityManager entityManager, String name, int age) {
        entityManager.getTransaction().begin(); // otwieramy transakcję przy pomocy Entity Managera

        // Tworzymy encję
        Person person = new Person();
        person.setName(name);
        person.setAge(age);

        // Zmieniamy stan encji z TRANSIENT (przejściowy) do stanu PERSISTENT (trwały)
        entityManager.persist(person);

        // zakomitujemy tę transakcję
        entityManager.getTransaction().commit();
    }
}
