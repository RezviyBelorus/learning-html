package springinaction.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service
public class UserService {
    @Autowired
    DAO dao;

    @Transactional
    public void addUser() throws SQLException {
        dao.add();
        throw new SQLException();
    }
}
