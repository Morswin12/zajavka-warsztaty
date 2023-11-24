package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P_17_Spring_Application_Testing__ZADANIE;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserManagementInMemoryRepository implements UserManagementRepository{

    private final Map<String, User> usersMap = new HashMap<>();

    public void create(final User user) {
        usersMap.put(user.getEmail(), user);
    }

    public List<User> findByName(final String name) {
        if (name.isEmpty()) {
            throw new RuntimeException("Name is empty");
        }
        List<User> result = usersMap.values().stream()
                .filter(user -> name.equals(user.getName()))
                .toList();

        return result;
    }

    public Optional<User> findByEmail(final String email) {
        return Optional.ofNullable(usersMap.get(email));
    }

    public List<User> findAll() {
        return usersMap.values().stream().toList();
    }

    public void update(final String oldUserEmail, final User newUser) {
        if (!usersMap.containsKey(oldUserEmail)) {
            throw new RuntimeException(String.format("User with email: [%s] doesn't exist", oldUserEmail));
        }
        usersMap.remove(oldUserEmail);
        usersMap.put(newUser.getEmail(), newUser);
    }

    public void delete(final String email) {
        if (!usersMap.containsKey(email)) {
            throw new RuntimeException(String.format("User with email: [%s] doesn't exist", email));
        }
        usersMap.remove(email);
    }
}
