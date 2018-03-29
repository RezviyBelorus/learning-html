package jpa.springdata;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDAO extends CrudRepository<User, Integer>{

    List<User> findByName(String name);
    User findByUsername(String name);

    List<User> findByNameLike(String nameLike);

    List<User> findByUsernameEndingWith(String endingWith);

}
