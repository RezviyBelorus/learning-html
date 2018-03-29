package springinaction.juggler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop-config.xml");
//        Performer performer = (Performer) ctx.getBean("duke");
//        performer.perform();

        DancerContestant contestant= (DancerContestant) ctx.getBean("dancerContestant");



//        ctx.getBean(Tinker.class).thinkOfSomething("sex");

//        Stage theStage = (Stage) ctx.getBean("theStage");
//
//        Performer instrumentalist = (Performer) ctx.getBean("kenny2");
//        instrumentalist.perform();
//
//        instrumentalist = (Performer) ctx.getBean("hank");
//        instrumentalist.perform();
//
//        instrumentalist = (Performer) ctx.getBean("carl");
//        instrumentalist.perform();
//
//        City city = (City) ctx.getBean("city");
//        city.displayCities();
//
//        instrumentalist = (Performer) ctx.getBean("frank");
//        instrumentalist.perform();


    }
}
