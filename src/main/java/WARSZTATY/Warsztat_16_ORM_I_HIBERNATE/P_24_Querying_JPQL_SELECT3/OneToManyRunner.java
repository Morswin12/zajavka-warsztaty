package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_24_Querying_JPQL_SELECT3;


public class OneToManyRunner {
    public static void main(String[] args) {
        OwnerRepository ownerRepository = new OwnerRepository();

        // poniej uzupeniamy tabelki w Bazie danych
//        ownerRepository.saveTestData();

        // Poniższe zapytanie wydrukuje nam w konsoli wyniki po użyciu INNER JOIN FETCH
//        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$---> INNER JOIN FETCH <---$$$$$$$$$$$$$$$$$\n");
//        ownerRepository.selectExample14();

        // Agregacja przy wykorzystaniu HQL w tym przypadku COUNT
//        ownerRepository.selectExample15();

        // Bardziej zaawansowane zapytanie z Agregacją i użyciem rekordu ToyStat (biznesowo nie ma to sensu, ale
        // pokazuje jak używać choćby MAX/MIN, COUNT i operatorów (/ * + -)
        ownerRepository.selectExample16();

        HibernateUtil.closeSessionFactory();

    }

}
