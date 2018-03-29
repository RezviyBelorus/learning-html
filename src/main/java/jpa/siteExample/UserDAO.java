package jpa.siteExample;

import java.util.List;

public interface UserDAO {
    void insertUser(User user);

    List<User> findAllUsers();
}
