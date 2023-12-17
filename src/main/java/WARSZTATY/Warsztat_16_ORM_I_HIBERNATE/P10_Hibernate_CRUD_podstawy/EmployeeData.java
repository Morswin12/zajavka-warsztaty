package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P10_Hibernate_CRUD_podstawy;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class EmployeeData {

    static EmployeeEntity someEmployee1() {
        return EmployeeEntity.builder()
                .name("Agnieszka")
                .surname("Pracownik")
                .salary(new BigDecimal("5910.73"))
                .since(OffsetDateTime.of(2020, 1, 1, 10, 10, 10, 0, ZoneOffset.UTC))
                .build();
    }

    static EmployeeEntity someEmployee2() {
        return EmployeeEntity.builder()
                .name("Stefan")
                .surname("Nowacki")
                .salary(new BigDecimal("3455.12"))
                .since(OffsetDateTime.of(2021, 2, 2, 10, 10, 10, 0, ZoneOffset.UTC))
                .build();
    }

    static EmployeeEntity someEmployee3() {
        return EmployeeEntity.builder()
                .name("Tomasz")
                .surname("Adamski")
                .salary(new BigDecimal("6112.42"))
                .since(OffsetDateTime.of(2022, 3, 3, 10, 10, 10, 0, ZoneOffset.UTC))
                .build();
    }
}
