package spring4pro.autobeanxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("autoBean-xml.xml");
        Target t = null;
        t = (Target) ctx.getBean("targetByName");
        t = (Target) ctx.getBean("targetByType");

        t = (Target) ctx.getBean("targetConstructor");
    }
}
