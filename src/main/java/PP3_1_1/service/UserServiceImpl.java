package PP3_1_1.service;

import PP3_1_1.dao.UserDao;
import PP3_1_1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDAO;

    @Autowired
    public UserServiceImpl(UserDao userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    @Override
    @Transactional
    public User readUserById(int id) {
        return userDAO.getOne(id);
    }

    @Override
    @Transactional
    public void addUser(User user) { userDAO.save(user);}

    @Override
    @Transactional
    public void deleteUserById(int id) { userDAO.deleteById(id); }
}

