package WARSZTATY.Warsztat_13_SPRING_BEANS.P_13_Wykorzystanie_w_praktyce.domain;


import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;

@Value
@Builder
public class User {

    String email;
    String name;
    String publicName;
    LocalDate birthDate;
}
