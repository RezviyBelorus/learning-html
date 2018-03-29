package spring4pro.ch3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("messageProvider22")
public class SexMessageProvider implements MessageProvider{
    private String message;
    private int value;

    @Autowired
    public SexMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
