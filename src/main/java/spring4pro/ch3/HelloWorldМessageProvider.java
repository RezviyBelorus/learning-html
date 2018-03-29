package spring4pro.ch3;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@ServiceDec("messageProvider")
public class HelloWorldМessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
