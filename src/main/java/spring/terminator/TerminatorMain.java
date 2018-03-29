package spring.terminator;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.terminator.interfaces.Quoter;
import spring.terminator.interfaces.impl.Terminator;

public class TerminatorMain {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Quoter terminator = context.getBean(Terminator.class);
        terminator.sayQuote();

    }
}
