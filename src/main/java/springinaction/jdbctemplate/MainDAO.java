package springinaction.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class MainDAO {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
        DAO dao = ctx.getBean(DAO.class);
        UserService us = ctx.getBean(UserService.class);
        try {
            us.addUser();
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        dao.add();

        Spitter user = dao.getName();
        System.out.println(user.getfName());
        System.out.println(user.getlName());
        System.out.println(user.getId());

//        dao.addNamed();
    }
}
