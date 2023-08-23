package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P13_Zadanie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserManagementService {

    private final HashMap<String, User> users = new HashMap<>();

    public void create(User user) {
        if (users.containsKey(user.getEmail())) {
            throw new RuntimeException(String.format("User with email: [%s] is already created", user.getEmail()));
        } else {
            users.put(user.getEmail(), new User(user.getName(), user.getSurname(), user.getEmail()));
        }
    }

    public Optional<User> findByEmail(String email) {
        return Optional.ofNullable(users.get(email));
    }

    public List<User> findByName(String name) {
        ArrayList<Object> result = new ArrayList<>();
        return users.entrySet().stream()
                .filter(v -> v.getValue().getName().equals(name))
                .map(a -> a.getValue())
                .collect(Collectors.toList());
    }

    public List<User> findAll() {
        ArrayList<User> result = new ArrayList<>();
        users.forEach((k, v) -> result.add(v));
        return result;

    }

    public void update(String oldEmail, User newUser) {
        if (!users.containsKey(oldEmail)) {
            throw new RuntimeException(String.format("User with email: [%s] doesn't exist", oldEmail));
        }else if (!oldEmail.equals(newUser.getEmail())) {
            users.remove(oldEmail);
        }
        users.put(newUser.getEmail(), newUser);
    }

    public void delete(String email) {
        if (!users.containsKey(email)) {
            throw new RuntimeException(String.format("User with email: [%s] doesn't exist", email));
        } else {
            users.remove(email);
        }
    }
}
