package spring4pro.parentxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("parent-xml.xml");
        SimpleBean sb = (SimpleBean) ctx.getBean("child2");
        System.out.println(sb.age);
        System.out.println(sb.name);
    }
}
