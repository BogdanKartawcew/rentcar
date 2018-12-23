package rentcar.service.user;

import java.util.HashSet;
import java.util.List;

import rentcar.model.Role;
import rentcar.model.User;

public interface UserService {

    User findById(int id);

    User findByLogin(String login);

    void save(User user);

    void update(User user);

    void deleteByLogin(String login);

    List<User> getAll();

    boolean isLoginUnique(Integer id, String login);

    List<User> getByRole(int roleId);
}