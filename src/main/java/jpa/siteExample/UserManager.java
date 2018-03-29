package jpa.siteExample;

import java.util.List;

public interface UserManager {
    void insertUser(User user);

    List<User> findAllUsers();
}
