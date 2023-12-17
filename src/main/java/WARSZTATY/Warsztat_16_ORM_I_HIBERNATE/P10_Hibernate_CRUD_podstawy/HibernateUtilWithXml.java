package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P10_Hibernate_CRUD_podstawy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtilWithXml {

    private static SessionFactory sessionFactory = null;

    static {
        try {
            loadSessionFactory();
        } catch (Exception exception) {
            System.err.println("Exception while initializing: " + exception);
        }
    }

    private static void loadSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure("/META-INF/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
    }

    static void closeSessionFactory() {
        try {
            sessionFactory.close();
        } catch (Exception e) {
            System.err.println("Exception while closing session factory: " + e);
        }
    }

    static Session getSession() {
        try {
            return sessionFactory.openSession();
        } catch (Exception e) {
            System.err.println("Exception while opening session: " + e);
        }
        return null;
    }
}
