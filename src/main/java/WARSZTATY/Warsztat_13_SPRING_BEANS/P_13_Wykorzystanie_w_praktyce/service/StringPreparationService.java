package WARSZTATY.Warsztat_13_SPRING_BEANS.P_13_Wykorzystanie_w_praktyce.service;

import WARSZTATY.Warsztat_13_SPRING_BEANS.P_13_Wykorzystanie_w_praktyce.domain.User;
import org.springframework.stereotype.Service;

@Service
public class StringPreparationService {

    public String prepare(final User user) {
        return String.format("%s;%s", user.getBirthDate(), user.getEmail());
    }
}
