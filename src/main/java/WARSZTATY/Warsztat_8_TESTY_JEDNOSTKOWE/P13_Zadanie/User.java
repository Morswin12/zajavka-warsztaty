package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P13_Zadanie;

import lombok.Builder;
import lombok.Value;
import lombok.With;

@Value
@Builder
@With
public class User implements Comparable<User> {
    private String name;
    private String surname;
    private String email;


    @Override
    public int compareTo(User o) {
        return o.email.compareTo(this.email);
    }
}


