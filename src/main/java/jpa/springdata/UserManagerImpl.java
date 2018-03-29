package jpa.springdata;

import jpa.springdata.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserManagerImpl{
    @Autowired
    private UserDAO userDAO;

    public void insertUser(User user) {
    userDAO.save(user);
    }

    public void deleteUser(int id) {
        userDAO.delete(id);
    }

    public List<User> findAllUsers() {
        Iterable<User> all = userDAO.findAll();
        List<User> list = new ArrayList<>();
        all.forEach(user->list.add(user));
        return list;
    }


    public List<User> findUserByName(String name) {
        return userDAO.findByName(name);
    }

    public User findUserByUserName(String userName) {
        return userDAO.findByUsername(userName);
    }

    public List<User> findUsersByNameLike(String nameLike) {
        return userDAO.findByNameLike(nameLike);
    }

    public List<User> findByNameEndingWith(String endingWith) {
        return userDAO.findByUsernameEndingWith(endingWith);
    }
}
