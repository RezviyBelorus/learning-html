package springinaction.contextcomponentscan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIdolConfig {
    @Bean
    public String display(){
        return "Display";
    }
}
