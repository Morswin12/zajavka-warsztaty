package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_31_Querying_Native_Query;


public class OneToManyRunner {
    public static void main(String[] args) {
        OwnerRepository ownerRepository = new OwnerRepository();

        // zapytanie przy pomocy NamedQuery zdefiniowanego w Ownerze i użytego w OwnerRepository
//        ownerRepository.selectExampleNamedQuery("rysiu@wp.pl");


        //-------------------------------------------------------------------------------------------
        //---- Film 26: -----------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------


//        ownerRepository.nativeQueryExample();
        ownerRepository.nativeQueryExample2();

        HibernateUtil.closeSessionFactory();

    }

}
