package spring4pro.ch3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring4pro.component.InjectSimpleConfig;
import spring4pro.component.InjectSimpleSpel;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring4pro-xml.xml");

        MessageRenderer mr = (MessageRenderer) ctx.getBean("messageRenderer");
        mr.render();

        ApplicationContext ctx2 = new ClassPathXmlApplicationContext("spring4pro-annotation.xml");

        MessageRenderer mr2 = (MessageRenderer) ctx2.getBean("messageRenderer");
        mr2.render();

        ApplicationContext ctx3 = new ClassPathXmlApplicationContext("spring4pro-annotation.xml");

        InjectSimpleSpel injectSimpleSpel = (InjectSimpleSpel) ctx3.getBean("injectSimpleSpel");
        System.out.println(injectSimpleSpel);

    }
}
