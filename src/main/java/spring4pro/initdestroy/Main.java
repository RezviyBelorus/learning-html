package spring4pro.initdestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("initdestroy-xml.xml");
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("initdestroy-xml.xml");
        ctx.registerShutdownHook();
        ctx.refresh();
        A a = ctx.getBean("init", A.class);
        a.display();

    }
}
