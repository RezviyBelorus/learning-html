package jpa.onetomany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Set;

public class MainHabra {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("JPA-2.xml");
        StudentManager sm = ctx.getBean(StudentManager.class);
        BookManager bm = ctx.getBean(BookManager.class);

//        bm.saveHobby(book2);

        Student student = new Student();
        student.setName("NewIlushan");

        Book book = new Book();
        book.setName("Harry Potter");
        book.setDescription("About Harry");
        book.setStudent(student);


        Book book2 = new Book();
        book2.setName("Pinki Winky");
        book2.setDescription("About Pinki Winki");
        book2.setStudent(student);
        
        Set<Book> set = new HashSet<>();
        set.add(book);
        set.add(book2);

        student.setBookList(set);
        sm.saveStudent(student);
    }
}
