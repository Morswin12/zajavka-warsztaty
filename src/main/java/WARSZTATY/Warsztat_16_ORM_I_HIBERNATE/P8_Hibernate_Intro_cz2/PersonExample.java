package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P8_Hibernate_Intro_cz2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PersonExample {
    public static void main(String[] args) {

        try (
                SessionFactory sessionFactory = createSesionFactory();
                Session session = sessionFactory.openSession();
        ) {
            session.beginTransaction(); // otwieramy transakcję

            Person person = new Person();
            person.setName("Paweł");
            person.setAge(35);
            session.persist(person);

            Person person2 = new Person();
            person2.setName("Goro");
            person2.setAge(74);
            session.persist(person2);

            session.getTransaction().commit(); // zamykamy transakcje

            Person person1 = session.find(Person.class, 0);
            System.out.println(person1);
        }
    }

    private static SessionFactory createSesionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure("/META-INF/hibernate.cfg.xml");
        return configuration.buildSessionFactory();
    }
}
