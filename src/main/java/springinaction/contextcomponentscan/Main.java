package springinaction.contextcomponentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springinaction.juggler.Performer;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context-component-scan.xml");

        Performer performer = (Performer) ctx.getBean("eddie");
        performer.perform();

        String s = (String) ctx.getBean("display");
        System.out.println(s);
    }
}
