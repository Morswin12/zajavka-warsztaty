package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_25_Querying_JPQL_Named_Query;



public class OneToManyRunner {
    public static void main(String[] args) {
        OwnerRepository ownerRepository = new OwnerRepository();

        // zapytanie przy pomocy NamedQuery zdefiniowanego w Ownerze i użytego w OwnerRepository
//        ownerRepository.selectExampleNamedQuery("rysiu@wp.pl");


        //-------------------------------------------------------------------------------------------
        //---- Film 26: -----------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------
        ownerRepository.getOwner(2);

        HibernateUtil.closeSessionFactory();

    }

}
