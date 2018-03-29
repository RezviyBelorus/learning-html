package jpa.manytomany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Set;

public class MainManyToMany {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("manytomany.xml");
        MenManager mm = ctx.getBean(MenManager.class);

        Men men1 = new Men();
        Men men2 = new Men();

        men1.setName("David");

        Hobby hobby1 = new Hobby();
        hobby1.setName("Diving");

        Hobby hobby2 = new Hobby();
        hobby2.setName("Swimming");

        Hobby hobby3 = new Hobby();
        hobby3.setName("Flying");

        Set<Hobby> hobbies = new HashSet<>();
        hobbies.add(hobby1);
        hobbies.add(hobby2);
        hobbies.add(hobby3);

        men1.setHobbyList(hobbies);

//        hm.saveOrUpdate(hobby2);
        mm.saveOrUpdateMen(men1);
//        mm.delete(70);



    }

}
