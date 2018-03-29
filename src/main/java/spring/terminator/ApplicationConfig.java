package spring.terminator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.terminator.beanpostprocessor.InjectIntAnnotationBeanPostProcessor;
import spring.terminator.interfaces.Quoter;
import spring.terminator.interfaces.impl.Terminator;

@Configuration
public class ApplicationConfig {
    private String message = "I'll be back";

    @Bean()
    public Terminator getQuoter(){
        return new Terminator(message);
    }

    @Bean
    public InjectIntAnnotationBeanPostProcessor getInjectIntAnnotationBeanPostProcessor() {
        return new InjectIntAnnotationBeanPostProcessor();
    }
}
