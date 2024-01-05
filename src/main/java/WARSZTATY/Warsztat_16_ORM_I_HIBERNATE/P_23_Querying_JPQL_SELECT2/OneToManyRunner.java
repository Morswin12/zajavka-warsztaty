package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_23_Querying_JPQL_SELECT2;


public class OneToManyRunner {
    public static void main(String[] args) {
        OwnerRepository ownerRepository = new OwnerRepository();

//        PetRepository petRepository = new PetRepository();
        // Poniższe zapytanie zwróci nam Ownera o imieniu "Rysiu"
        // Gdyby 2 Ownerów miało na imię "Rysiu" to dostalibyśmy wyjątek: "NonUniqueResultException", dlatego należy
        // używać tych metod na kolumnach z oznaczeniem "UNIQUE).
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$---> WARTOSCI UNIKALNE <---$$$$$$$$$$$$$$$$$\n");
        System.out.println("### RESULT: " + ownerRepository.selectExample8("Rysiu"));

        // Poniższe zapytanie zwróci nam Optional.empty, bo nie mamy Ownera o imieniu "Rysiu"
        System.out.println("### RESULT: " + ownerRepository.selectExample8("Rysiu2"));

        // Poniższe zapytanie wydrukuje nam w konsoli wyniki po użyciu INNER JOIN
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$---> INNER JOIN <---$$$$$$$$$$$$$$$$$\n");
        ownerRepository.selectExample9();

        // Poniższe zapytanie wydrukuje nam w konsoli wyniki po użyciu JOIN FETCH ( wynik będzie ten sam co po użyciu
        // INNER JOIN, ale Hibernate zamiast 3 zapytań (1 do ownera i 2 do pets) użyje jednego zjoinowanego zapytania)
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$---> JOIN FETCH <---$$$$$$$$$$$$$$$$$\n");
        ownerRepository.selectExample9_2();

        // Poniższe zapytanie wydrukuje nam w konsoli wyniki po użyciu LEFT JOIN
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$---> LEFT JOIN <---$$$$$$$$$$$$$$$$$\n");
        ownerRepository.selectExample10();

        // Poniższe zapytanie wydrukuje nam w konsoli wyniki po użyciu LEFT JOIN FETCH (wynik będzie ten sam jak po
        // LEFT JOIN, ale Hibernate zamiast wielu zapytań do ownerów i pets oddzielnie użyje jednego zjoinowanego
        // zapytania.
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$---> LEFT JOIN FETCH <---$$$$$$$$$$$$$$$$$\n");
        ownerRepository.selectExample10_2();

        // Poniższe zapytanie wydrukuje nam w konsoli wyniki po użyciu RIGHT JOIN
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$---> RIGHT JOIN <---$$$$$$$$$$$$$$$$$\n");
        ownerRepository.selectExample11();

        // Poniższe zapytanie wydrukuje nam w konsoli wyniki po użyciu RIGHT JOIN FETCH (wynik będzie ten sam jak po
        // RIGHT JOIN, ale Hibernate zamiast wielu zapytań do ownerów i pets oddzielnie użyje jednego zjoinowanego
        // zapytania.
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$---> RIGHT JOIN FETCH <---$$$$$$$$$$$$$$$$$\n");
        ownerRepository.selectExample11_2();

      // Poniższe zapytanie wydrukuje nam w konsoli wyniki po użyciu FULL JOIN
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$---> FULL JOIN <---$$$$$$$$$$$$$$$$$\n");
        ownerRepository.selectExample12();

        // Poniższe zapytanie wydrukuje nam w konsoli wyniki po użyciu FULL JOIN FETCH (wynik będzie ten sam jak po
        // FULL JOIN, ale Hibernate zamiast wielu zapytań do ownerów i pets oddzielnie użyje jednego zjoinowanego
        // zapytania.
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$---> FULL JOIN FETCH <---$$$$$$$$$$$$$$$$$\n");
        ownerRepository.selectExample12_2();

      // Poniższe zapytanie wydrukuje nam w konsoli wyniki po użyciu CROSS JOIN
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$---> CROSS JOIN <---$$$$$$$$$$$$$$$$$\n");
        ownerRepository.selectExample13();

        // Nie ma CROSS JOIN FETCH. chyba??


//        ownerRepository.insertData(someOwner1(), Set.of(somePet1(), somePet2()));
//        ownerRepository.insertData(someOwner2(), Set.of(somePet3(), somePet4()));
//        ownerRepository.insertData(someOwner3(), Set.of());
//        ownerRepository.insertData(someOwner4(), Set.of());
//        petRepository.insertData(somePet5());
//        petRepository.insertData(somePet6());

        HibernateUtil.closeSessionFactory();

    }

}
