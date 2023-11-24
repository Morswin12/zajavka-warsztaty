package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P_17_Spring_Application_Testing__ZADANIE;

import java.util.List;
import java.util.Optional;

public interface UserManagementRepository {

    void create(final User user);

    List<User> findByName(final String name);

    Optional<User> findByEmail(final String email);

    List<User> findAll();

    void update(final String oldUserEmail, final User newUser);

    void delete(final String email);
}
