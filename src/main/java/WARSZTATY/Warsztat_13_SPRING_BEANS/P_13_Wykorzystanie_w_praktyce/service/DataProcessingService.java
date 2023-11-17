package WARSZTATY.Warsztat_13_SPRING_BEANS.P_13_Wykorzystanie_w_praktyce.service;

import WARSZTATY.Warsztat_13_SPRING_BEANS.P_13_Wykorzystanie_w_praktyce.domain.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class DataProcessingService {

    private final StringPreparationService stringPreparationService;

    public List<String> process(final List<User> users) {

        return users.stream()
                .sorted(Comparator.comparing(User::getBirthDate))
                .map(stringPreparationService::prepare)
                .peek(line -> log.info("Prepared line: [{}]", line))
                .toList();


    }
}
