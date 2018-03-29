package spring4pro.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("properties-xml.xml");
        PreMain inj = (PreMain) ctx.getBean("preMain");
        inj.inj.display();
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(x-> System.out.println(x));
    }
}
