package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P13_15_Hibernate_Relacje.P14_Hibernate_Relacje_One_To_Many;

import WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P13_15_Hibernate_Relacje.HibernateUtil;
import org.hibernate.Session;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class OwnerRepository {

    Owner insertData(final Owner owner, final Set<Pet> pets) {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            System.out.println("###BEFORE INSERT \n ----------------------------------");
            session.beginTransaction();
            owner.setPets(pets);
            pets.forEach(pet -> pet.setOwner(owner));
            session.persist(owner);
            session.getTransaction().commit();
            System.out.println(" ---------------------------------- \n ### AFTER INSERT");
            return owner;
        }
    }

    List<Owner> listOwners() {
        try (
                Session session = HibernateUtil.getSession()
        ) {
            if (Objects.isNull(session)) {
                throw new RuntimeException("Session is null");
            }
            session.beginTransaction();
            String query = "SELECT owner FROM Owner owner";
            List<Owner> owners = session.createQuery(query, Owner.class).list();
            session.getTransaction().commit();
            return owners;
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
//            Pet newPet2 = Pet.builder().name(newPet.getName()).breed(newPet.getBreed()).owner(owner).build();
            Set<Pet> pets = owner.getPets();
            pets.add(newPet);
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
            String query = "SELECT owner from Owner owner";
            session.createQuery(query, Owner.class).list().forEach(session::remove);
            session.getTransaction().commit();
            System.out.println(" ---------------------------------- \n ### AFTER DELETE ALL");
        }

    }
}
