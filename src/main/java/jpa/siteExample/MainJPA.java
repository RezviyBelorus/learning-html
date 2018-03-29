package jpa.siteExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainJPA {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("JPA.xml");
        UserManager userManager = ctx.getBean(UserManager.class);

        List<User> list = userManager.findAllUsers();
        System.out.println("User count: " + list.size());

        
        User user = new User();
        user.setUsername("New User");
        user.setName("Snow");
//        Hobby hobby = new Hobby();
//        hobby.setHobby("DIVING");
//        user.setHobby(hobby);
        userManager.insertUser(user);

        list = userManager.findAllUsers();
    }
}
