package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P_17_Spring_Application_Testing__ZADANIE;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserManagementService {

    private final UserManagementRepository userManagementRepository;

    public void create(final User user) {
        if (userManagementRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException(String.format("User with email: [%s] is already created", user.getEmail()));
        }
        userManagementRepository.create(user);
    }

    public List<User> findByName(final String name) {
        return userManagementRepository.findByName(name);
    }

    public Optional<User> findByEmail(final String email) {
        return userManagementRepository.findByEmail(email);
    }

    public List<User> findAll() {
        return userManagementRepository.findAll();
    }

    public void update(final String email, final User withEmail) {
        if (userManagementRepository.findByEmail(email).isEmpty()) {
            throw new RuntimeException(String.format("User with email: [%s] is already created", email));
        }
        userManagementRepository.update(email, withEmail);
    }

    public void delete(String email) {
        if (userManagementRepository.findByEmail(email).isEmpty()) {
            throw new RuntimeException(String.format("User with email: [%s] is already created", email));
        }
        userManagementRepository.delete(email);
    }
}
