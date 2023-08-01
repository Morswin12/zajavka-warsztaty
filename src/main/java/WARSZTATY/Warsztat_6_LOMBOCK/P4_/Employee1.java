package WARSZTATY.Warsztat_6_LOMBOCK.P4_;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Employee1 {
    private String name;
    @Getter(AccessLevel.NONE)
    private String surname;
    private String email;
    private BigDecimal salary;
    @NonNull
    private LocalDate dateOfBirth;
    private String address;
}
