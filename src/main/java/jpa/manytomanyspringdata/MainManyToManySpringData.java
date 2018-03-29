package jpa.manytomanyspringdata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainManyToManySpringData {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("many-to-many-spring-data.xml");

        MenManager mm = ctx.getBean(MenManager.class);

        Men men1 = new Men();
        Men men2 = new Men();

        men1.setName("Jora");

        Hobby hobby1 = new Hobby();
        hobby1.setName("Diving");
//        hobby1.getMenSet().add(men1);

        Hobby hobby2 = new Hobby();
        hobby2.setName("Swimming");
//        hobby2.getMenSet().add(men1);

        Set<Hobby> hobbies = new HashSet<>();
        hobbies.add(hobby1);
        hobbies.add(hobby2);

        men1.setHobbyList(hobbies);
//        mm.saveMen(men1);

        List<Men> menList = mm.findAll();
        Set<Hobby> hobbyList1 = menList.get(0).getHobbyList();
        hobbyList1.size();
        Set<Hobby> hobbyList2 = menList.get(1).getHobbyList();
        hobbyList2.size();
    }
}
