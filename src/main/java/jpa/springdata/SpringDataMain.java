package jpa.springdata;

import jpa.springdata.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringDataMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-data.xml");
        UserManagerImpl userManager = ctx.getBean(UserManagerImpl.class);
        List<User> allUsers = userManager.findAllUsers();
//        User user = new User();
//        user.setUsername("Bondarev2");
//        user.setName("Sergeev");
//        userManager.insertUser(user);
//
//        user = new User();
//        user.setUsername("Бодров2");
//        user.setName("Пузиков");
//        userManager.insertUser(user);

//        userManager.deleteUser(4);
        userManager.findUserByName("Snow");
        User bond = userManager.findUserByUserName("Bond");
        userManager.findUsersByNameLike("%ow");
        userManager.findByNameEndingWith("2");

    }
}
