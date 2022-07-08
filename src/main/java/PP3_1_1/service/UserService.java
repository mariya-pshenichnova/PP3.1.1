package PP3_1_1.service;

import PP3_1_1.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User readUserById(int id);
    void addUser(User user);
    void deleteUserById(int id);
}
