package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P_17_Spring_Application_Testing__ZADANIE;

import lombok.Builder;
import lombok.Value;
import lombok.With;

@Value
@With
@Builder
public class User implements Comparable<User> {

    String name;
    String surname;
    String email;

    @Override
    public int compareTo(final User o) {
        return o.email.compareTo(email);
    }
}
