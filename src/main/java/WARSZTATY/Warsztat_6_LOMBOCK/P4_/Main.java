package WARSZTATY.Warsztat_6_LOMBOCK.P4_;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Owner owner1 = new Owner("Adam", 43, List.of("papa", "fryty"));
        Owner owner2 = new Owner("Bartek", 23, List.of("kebab", "piwerko"));

        Dog dog1 = new Dog("ASDD", 3, owner1);
        Dog dog2 = new Dog("PIPEK", 7, owner2);

        Employee1 employee1 = new Employee1(LocalDate.of(2015, 3,22));
        System.out.println(employee1);

        Employee2 employee2 = new Employee2("aaaa", "bbbb", "adsad@sdfds.pl", BigDecimal.TEN, null, null);
        System.out.println(employee2);

        Employee2 employee21 = Employee2.builder()
                .name("Andrzej")
                .surname("Krycha")
                .salary(BigDecimal.TWO)
                .build();

        System.out.println(employee21);

//        fileSize(Paths.get("nieMaNic.txt"));
    }

//    @SneakyThrows
//    public static void fileSize(Path path) {
//        try {
//            Files.size(path);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
