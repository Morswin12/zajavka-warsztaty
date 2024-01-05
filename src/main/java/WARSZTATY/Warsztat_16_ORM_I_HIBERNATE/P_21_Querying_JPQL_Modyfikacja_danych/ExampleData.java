package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_21_Querying_JPQL_Modyfikacja_danych;


public class ExampleData {

    static Owner someOwner1() {
        return Owner.builder()
                .name("Sebastian")
                .surname("Kowalski")
                .phone("123456789")
                .email("seba@wp.pl")
                .build();
    }

    static Owner someOwner2() {
        return Owner.builder()
                .name("Rysiu")
                .surname("Fiołek")
                .phone("123333333")
                .email("rysiu@wp.pl")
                .build();
    }

    static Pet somePet1() {
        return Pet.builder()
                .name("Burek")
                .breed(Breed.DOG).build();
    }

    static Pet somePet2() {
        return Pet.builder()
                .name("Kiciak")
                .breed(Breed.CAT).build();
    }

    static Pet somePet3() {
        return Pet.builder()
                .name("KingKong")
                .breed(Breed.MONKEY).build();
    }

    static Pet somePet4() {
        return Pet.builder()
                .name("Sachem")
                .breed(Breed.DOG).build();
    }
}
