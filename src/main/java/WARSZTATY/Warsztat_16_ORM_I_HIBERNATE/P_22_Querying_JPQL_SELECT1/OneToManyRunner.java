package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_22_Querying_JPQL_SELECT1;


import java.util.Set;

public class OneToManyRunner {
    public static void main(String[] args) {
        OwnerRepository ownerRepository = new OwnerRepository();

        // Wypisujemy wszystkie dane z tabeli, podobnie jak poniżej, w tym, że zapytanie ma skróconą wersję
//        System.out.println("#### Result selectExample1: " + ownerRepository.selectExample2());

        // Poniżej robimy zwykłego selecta do odczytu wszystkich danych z tabeli owner
//        System.out.println("#### Result selectExample2: " + ownerRepository.selectExample2());

        // poniżej zapisujemy wybrane pozycje z bazy danych tdo listy tabel, dlatego, aby odczytać potrzebujemy
        //      użyć Arrays.asList()
//        ownerRepository.selectExample3().forEach(entity -> System.out.println("### Entity: " + Arrays.asList(entity)));

        // Poniżej wykorzystujemy rekord OwnerTemp do zapisu danych z bazy danych, musimy w nim podać pola, które
        //      chcemy wyciągnąć
//        ownerRepository.selectExample4().forEach(entity -> System.out.println("### Entity: " + entity));

        // Poniżej zapytanie z ograniczeniem WHERE (email = "rysiu@wp.pl")
//        ownerRepository.selectExample5().forEach(entity -> System.out.println("### Entity: " + entity));

        // Poniżej mamy zapytanie z posegregowaniem najpierw po emailu rosnąco, a następnie po imieniu malejąco
//        ownerRepository.selectExample6().forEach(entity -> System.out.println("### Entity: " + entity));

        // Poniżej mamy wyniki posortowane po email malejąco
//        ownerRepository.selectExample7().forEach(entity -> System.out.println("### Entity: " + entity));

        // jak wyżej, ale z pominięciem pierwszych 3 wierszy
//        ownerRepository.selectExample7_a().forEach(entity -> System.out.println("### Entity: " + entity));

        // Poniżej mamy wyniki posortowane po email malejąco, ale z podaniem maksymalnej liczby wierszy, które
        //        mają się wyświetlić, w tym przypadku 2 pierwsze wiersze
//        ownerRepository.selectExample7_b().forEach(entity -> System.out.println("### Entity: " + entity));

        // Poniżej mamy wyniki posortowane po email malejąco, ale z podaniem maksymalnej liczby wierszy, które
        //        mają się wyświetlić, w tym przypadku 2 pierwsze wiersze oraz pominięciem 2 pierwszych wierszy
        ownerRepository.selectExample7_c().forEach(entity -> System.out.println("### Entity: " + entity));

        /*
        tworzenie użytkowników do bazy danych:

        ownerRepository.deleteAll();

        Owner owner4 = ownerRepository.insertData(ExampleData.someOwner1(),
                        Set.of(ExampleData.somePet5(), ExampleData.somePet5()));
        Owner owner5 = ownerRepository
                .insertData(ExampleData.someOwner2(),
                        Set.of(ExampleData.somePet2(), ExampleData.somePet4(), ExampleData.somePet5()));
        Owner owner6 = ownerRepository
                .insertData(ExampleData.someOwner3(),
                        Set.of(ExampleData.somePet1()));        Owner owner4 = ownerRepository.insertData(ExampleData.someOwner4(),
                        Set.of(ExampleData.somePet5(), ExampleData.somePet2()));
        Owner owner5 = ownerRepository
                .insertData(ExampleData.someOwner5(),
                        Set.of(ExampleData.somePet3(), ExampleData.somePet4(), ExampleData.somePet5()));
        Owner owner6 = ownerRepository
                .insertData(ExampleData.someOwner6(),
                        Set.of(ExampleData.somePet6()));
*/

//
//        List<Owner> owners = ownerRepository.findAllHQL();
//        owners.forEach(owner -> System.out.println(
//                "Owner: " + owner.getName() + " " + owner.getSurname() +
//                        ", email: " + owner.getEmail() +
//                        ", phone: " + owner.getPhone() +
//                        ", pets: " + wypiszZwierzeta(owner.getPets())
//                )
//        );

        HibernateUtil.closeSessionFactory();
    }

    private static String wypiszZwierzeta(Set<Pet> pets) {
        StringBuilder petsLine = new StringBuilder("");
        pets.forEach(pet -> petsLine.append(pet.getName()).append(", "));
        return petsLine.toString();
    }
}
