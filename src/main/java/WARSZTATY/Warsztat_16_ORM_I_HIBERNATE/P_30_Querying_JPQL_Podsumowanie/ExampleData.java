package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_30_Querying_JPQL_Podsumowanie;

public class ExampleData {

    static Address someAddress1() {
        return Address.builder()
                .country("Poland")
                .city("Szczecin")
                .postalCode("70-112")
                .address("Witolda Jakiegoś 3")
                .build();
    }

    static Address someAddress2() {
        return Address.builder()
                .country("Poland")
                .city("Gdynia")
                .postalCode("82-123")
                .address("3 maja 16")
                .build();
    }

    static Customer someCustomer1() {
        return  Customer.builder()
                .name("Stefan")
                .surname("Nowacki")
                .phone("+48 589 245 114")
                .email("stefan@zajavka.pl")
                .address(someAddress1())
                .build();
    }

    static Customer someCustomer2() {
        return  Customer.builder()
                .name("Adrian")
                .surname("Paczkomat")
                .phone("+48 894 235 331")
                .email("adrian@zajavka.pl")
                .address(someAddress2())
                .build();
    }
}
