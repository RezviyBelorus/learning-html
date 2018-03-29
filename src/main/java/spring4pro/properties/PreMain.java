package spring4pro.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("preMain")
public class PreMain {
    @Autowired
    InjectProperties inj;

}
