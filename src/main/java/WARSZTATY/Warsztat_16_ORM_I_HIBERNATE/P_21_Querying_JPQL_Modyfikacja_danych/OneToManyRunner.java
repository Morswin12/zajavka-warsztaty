package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_21_Querying_JPQL_Modyfikacja_danych;

public class OneToManyRunner {
    public static void main(String[] args) {
        OwnerRepository ownerRepository = new OwnerRepository();

//        ownerRepository.deleteAll();
//        ownerRepository.insertHQL();
//        int i = ownerRepository.updateHQL("rz@gmail.pl", "+354 7777777", "rz_nowy@gmail.com");
//        System.out.println("########### Result update: " + i);

        int i1 = ownerRepository.deleteHQL("rz@gmail.com");
        int i2 = ownerRepository.deleteHQL("rz_nowy@gmail.com");
        System.out.println("Result 1: " + i1 );
        System.out.println("Result 2: " + i2 );

        HibernateUtil.closeSessionFactory();
    }
}
