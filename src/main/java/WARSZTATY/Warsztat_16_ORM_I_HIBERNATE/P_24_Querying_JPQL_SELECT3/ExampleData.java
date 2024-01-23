package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_24_Querying_JPQL_SELECT3;


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

    static Owner someOwner3() {
        return Owner.builder()
                .name("Ania")
                .surname("Żak")
                .phone("999999999")
                .email("zakania@o2.pl")
                .build();
    }

    static Owner someOwner4() {
        return Owner.builder()
                .name("Paweł")
                .surname("Snopek")
                .phone("999234234234")
                .email("goro@gmail.pl")
                .build();
    }

    static Owner someOwner5() {
        return Owner.builder()
                .name("Adam")
                .surname("Niebiański")
                .phone("111111111")
                .email("adam0@imperia.com")
                .build();
    }


    static Owner someOwner6() {
        return Owner.builder()
                .name("Ewa")
                .surname("Zrajchu")
                .phone("22222222222")
                .email("niebo2_0@heaven.com")
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

    static Pet somePet5() {
        return Pet.builder()
                .name("Łaska")
                .breed(Breed.WEASEL).build();
    }

    static Pet somePet6() {
        return Pet.builder()
                .name("Wilczek")
                .breed(Breed.WOLF).build();
    }

    static Pet somePet7() {
        return Pet.builder()
                .name("Kuneczka")
                .breed(Breed.MARTEN).build();
    }

    static Toy someToy1() {
        return Toy.builder()
                .what("car")
                .color("black")
                .build();
    }

    static Toy someToy2() {
        return Toy.builder()
                .what("cat")
                .color("white")
                .build();
    }

    static Toy someToy3() {
        return Toy.builder()
                .what("bear")
                .color("green")
                .build();
    }

    static Toy someToy4() {
        return Toy.builder()
                .what("duck")
                .color("blue")
                .build();
    }
}
