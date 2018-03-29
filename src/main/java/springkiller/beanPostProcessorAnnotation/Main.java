package springkiller.beanPostProcessorAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-killer.xml");
            ctx.getBean(TerminatorQuoter.class).sayQuote();
    }
}
