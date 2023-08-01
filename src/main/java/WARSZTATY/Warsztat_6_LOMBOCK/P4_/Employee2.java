package WARSZTATY.Warsztat_6_LOMBOCK.P4_;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDate;

@Value
@Builder
public class Employee2 {
    String name;
    String surname;
    String email;
    BigDecimal salary;
    LocalDate dateOfBirth;
    String address;
}
