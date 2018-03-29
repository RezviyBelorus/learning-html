package springinaction.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Component
public class DAO {
    private static final String INSERT_QUERY = "INSERT INTO users (id, fName, l_name) VALUES (?, ?, ?)";
    private static final String INSERT_NAMED_QUERY = "INSERT INTO users (id, fName, l_name) VALUES (:id, :firstName, :l_name)";
    private static final String SELECT_QUERY = "SELECT * FROM users WHERE fName = ?";
    @Autowired
    private JdbcTemplate template;

    @Autowired
    private NamedParameterJdbcTemplate namedTemplate;

    @Autowired
    private DataSourceTransactionManager transaction;

    @Transactional
    public boolean add() {
        template.update(INSERT_QUERY, 1, "Баста", "Наебака");
        return true;
    }

    public Spitter getName(){
        return template.queryForObject(SELECT_QUERY, new RowMapper<Spitter>() {
            @Override
            public Spitter mapRow(ResultSet rs, int i) throws SQLException {
                Spitter spitter = new Spitter();
                spitter.setId(rs.getInt(1));
                spitter.setfName(rs.getString(2));
                spitter.setlName(rs.getString(3));
                return spitter;
            }
        }, "Lexx");

    }

    public boolean addNamed(){
        Map<String, Object> params = new HashMap<>();
        params.put("l_name", "Серпухов");
        params.put("id", "333");
        params.put("firstName", "Raph");
        namedTemplate.update(INSERT_NAMED_QUERY, params);
        return true;
    }
}
