package WARSZTATY.Warsztat_13_SPRING_BEANS.P_13_Wykorzystanie_w_praktyce.service;

import WARSZTATY.Warsztat_13_SPRING_BEANS.P_13_Wykorzystanie_w_praktyce.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Slf4j
@Repository
//@Repository
public class DataRepository {

    public List<User> readUsers() {
        try {
            return Files.readAllLines(ResourceUtils.getFile(
                    "classpath:users.csv")
                            .toPath())
                    .stream()
                    .map(this::mapUser)
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .toList()
                    ;
        } catch (IOException ex) {
            log.error("Error reading user.csv");
            return List.of();
        }
    }

    private Optional<User> mapUser(String line) {
        if (!line.contains("@")) {
            return Optional.empty();
        }
        List<String> listAsList = Arrays.asList(line.split(";"));
            return Optional.of(User.builder()
                .email(listAsList.get(0))
                .name(listAsList.get(1))
                .publicName(listAsList.get(2))
                .birthDate(LocalDate.parse(listAsList.get(3)))
                .build());
    }

    public void save(final List<String> processed) {
        try {
            Files.write(Paths.get("build/result.txt"), processed);
        } catch (IOException ex) {
            log.error("Error saving data", ex);
        }
    }
}
