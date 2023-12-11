package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P2_JPA_cz1;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class Main {
    /*
    JPA (Jakarta Persistence API) -> Dotyczy Javy. Jest to standard określający, w jaki sposób program Java ma się
            komunikować z relacyjną bazą danych. Jak to zazwyczaj z Java bywa, do określenia specyfikacji, czyli co i
            jak ma działać, stosowane są interfejsy. Tak samo jest i w tym przypadku i standard JPA to zbiór
            interfejsów, które określają, jakie metody muszą być zaimplementowane.
                W wersji 3.0 nazwa JPA została zmieniona z java Persistence API na Jakarta Persistence API. Niby nic
            wielkiego, ale zmiana dotyczyła także nazw pakietów i właściwości używanych do konfiguracji z
            javax.persistence na jakarta.persistence.

        Co definiuje specyfikacja JPA:
            - W jaki sposób mapować klasy (encje) do tabel bazodanowych (adnotacje pliki xml);
            - Daje nam Interfejsy do operacji CRUD (create, read, update, delete);
            - Dostarcza język JPQL (Jakarta Persistence Query Language) i API do tworzenia zapytań SQL Criteria API;
            - Strategie pracy z transakcjami, pobieranie zależności między encjami i strategie optymalizacji;

     JDBC vs JPA:
            Czyli JDBC jest standardem, który pozwala Javie rozmawiać z bazami danych. Zestawiając go z informacjami
        odnośnie JPA, to JDBC to standard bezpośredniego łączenia się z bazą danych i uruchamiania na niej zapytań SQL,
        np.: SELECT * FROM ORDERS. W wyniku wykonania zapytań możemy zwracać zestaw danych, które następnie możemy
        ręcznie obsługiwać w naszej aplikacji. Możemy również wykonywać zapytania: INSERT, DELETE oraz UPDATE.
        Jest to jedna z technologi leżąca u podstaw większości dostępu do baz danych Java (w tym dostawców konkretnych
        API). Przez to ulegamy pokusie, żeby logika programu zaczynała się mieszać i przeplatać z zapytaniami do BD.
            Dla porównania JPA to standard mapowania relacyjnego obiektów, czyli ORM. Technologie JPA pozwalają na
        mapowanie pomiędzy encjami bazodanowymi a kodem Java w "prostszy" sposób. Jest to niejako kolejna warstwa
        abstrakcji. JPA pozwala, żeby deweloper nie musiał pisać SQL-ek z palca. Dużo rzeczy dzieje się "magicznie".
        Praca z narzędziami JPA będzie się skupiała na określeniu w klasach Java jak ma wyglądać analogiczna
        struktura encji bazodanowej

     ORM jest podejściem polegającym na mapowaniu danych w postaci obiektów do relacyjnych baz danych, czyli tabel w
        RDBSM. Można powiedzieć, że JPA jest ustandaryzowaną specyfikacja dla ORM.
            JPA jest specyfikacją, oznacza to, że żeby móc z niego korzystać musimy miec dostawcę, który będzie taką
        specyfikację implementował.
     */

    public static void main(String[] args) {

        // Entity Manager Factory
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("nazwaNaszejPersistenceUnitName");// nazwa ta jest w pliku persistence.xml

        //Entity Manager
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Query
        String selectQuery = "SELECT p FROM Person p";
        Query query = entityManager.createQuery(selectQuery);
        List<Person> people = query.getResultList();

        // Criteria API
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Person> criteriaQuery = criteriaBuilder.createQuery(Person.class);
        Root<Person> root = criteriaQuery.from(Person.class);
        criteriaQuery.select(root);
        TypedQuery<Person> query1 = entityManager.createQuery(criteriaQuery);
        List<Person> people1 = query1.getResultList();
    }
}
