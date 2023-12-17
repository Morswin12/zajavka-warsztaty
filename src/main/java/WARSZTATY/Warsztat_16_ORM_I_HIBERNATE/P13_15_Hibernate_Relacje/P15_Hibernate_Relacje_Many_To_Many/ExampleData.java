package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P13_15_Hibernate_Relacje.P15_Hibernate_Relacje_Many_To_Many;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class ExampleData {

    static Employee someEmployee1() {
        return Employee.builder()
                .name("Ryszard")
                .surname("Krawczyk")
                .salary(new BigDecimal("5934.33"))
                .since(OffsetDateTime.of(
                        2020, 1, 1, 10, 10, 10, 0,
                        ZoneOffset.UTC))
                .build();
    }

    static Employee someEmployee2() {
        return Employee.builder()
                .name("Adam")
                .surname("Puszczyk")
                .salary(new BigDecimal("2344.44"))
                .since(OffsetDateTime.of(
                        2021, 2, 2, 20, 20, 20, 0,
                        ZoneOffset.UTC))
                .build();
    }

    static Employee someEmployee3() {
        return Employee.builder()
                .name("Ryś")
                .surname("Pitras")
                .salary(new BigDecimal("2289.65"))
                .since(OffsetDateTime.of(
                        2022, 3, 3, 3, 30, 30, 0,
                        ZoneOffset.UTC))
                .build();
    }

    static Project someProject1() {
        return Project.builder()
                .name("Data Base migration")
                .description("Some text like Lorem ipsum dolor sit amet, consectetur adipiscing elit")
                .deadline(OffsetDateTime.of(
                        2025, 4, 4, 4, 40, 40, 0,
                        ZoneOffset.UTC))
                .build();
    }

    static Project someProject2() {
        return Project.builder()
                .name("some external system integration")
                .description("Some other text like: Nulla hand foot, basketball")
                .deadline(OffsetDateTime.of(
                        2027, 5, 5, 5, 50, 50, 0,
                        ZoneOffset.UTC))
                .build();
    }

    static Project someProject3() {
        return Project.builder()
                .name("Email sending refactoring")
                .description("extra new description por this project will be in the future")
                .deadline(OffsetDateTime.of(
                        2028, 6, 6, 6, 56, 56, 0,
                        ZoneOffset.UTC))
                .build();
    }

}
