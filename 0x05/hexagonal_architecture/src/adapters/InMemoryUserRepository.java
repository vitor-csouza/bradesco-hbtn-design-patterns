package adapters;

import domain.User;
import ports.UserRepository;

import java.util.*;

public class InMemoryUserRepository implements UserRepository {

    private final Map<String, User> database = new HashMap<>();

    @Override
    public void save(User user) {
        database.put(user.getId(), user);
    }

    @Override
    public User findById(String id) {
        return database.get(id);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(database.values());
    }
}
