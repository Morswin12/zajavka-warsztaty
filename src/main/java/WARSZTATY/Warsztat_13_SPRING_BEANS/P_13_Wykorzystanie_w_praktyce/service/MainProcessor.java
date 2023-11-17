package WARSZTATY.Warsztat_13_SPRING_BEANS.P_13_Wykorzystanie_w_praktyce.service;

import WARSZTATY.Warsztat_13_SPRING_BEANS.P_13_Wykorzystanie_w_praktyce.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class MainProcessor {

    private final DataRepository dataRepository;
    private final DataProcessingService dataProcessingService;

    public void process() {
        List<User> users = dataRepository.readUsers();
        List<String> processed = dataProcessingService.process(users);
        dataRepository.save(processed);
    }
}
