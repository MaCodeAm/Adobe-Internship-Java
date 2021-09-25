package week7.UserRepository;

public interface UserRepository {
    void save(User user);

    void deleteAll();
}
