package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P13_15_Hibernate_Relacje.P14_Hibernate_Relacje_One_To_Many;

import WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P13_15_Hibernate_Relacje.HibernateUtil;

import java.util.Set;

public class OneToManyRunner {
    public static void main(String[] args) {
        OwnerRepository ownerRepository = new OwnerRepository();

        ownerRepository.deleteAll();

        Owner owner1 = ownerRepository
                .insertData(ExampleData.someOwner1(),
                        Set.of(ExampleData.somePet1(), ExampleData.somePet2()));
//        Owner owner2 = ownerRepository
//                .insertData(ExampleData.someOwner2(),
//                        Set.of(ExampleData.somePet3(), ExampleData.somePet4()));


//        ownerRepository.listOwners()
//                .forEach(owner -> System.out.println("##Owner: listing: " + owner));

        System.out.println("##Owner1: " + ownerRepository.getOwner(owner1.getId()));
//        System.out.println("##Owner1: " + ownerRepository.getOwner(owner2.getId()));

//        Pet newPet = Pet.builder()
//                .name("Koczkodan")
//                .breed(Breed.MONKEY)
//                .owner(owner1)
//                .build();
//
//        ownerRepository.updateOwner(owner1.getId(), newPet);
//        System.out.println("##Owner Updated : " + ownerRepository.getOwner(owner1.getId()));
//
//        ownerRepository.deleteOwner(owner2.getId());

        HibernateUtil.closeSessionFactory();
    }
}
