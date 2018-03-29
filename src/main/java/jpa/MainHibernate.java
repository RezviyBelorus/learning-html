package jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHibernate {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("JPA-2.xml");

        Student student = new Student();
        student.setFirstName("Alex");
        student.setLastName("Bodrov");
        student.setYearLevel(4);

        StudentService studentService = ctx.getBean(StudentService.class);
        studentService.add(student);
    }
}
