package spring4pro.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("injectProperties")
public class InjectProperties {
    @Value("${msg.display}")
    private String msg;
    @Autowired
    @Qualifier("msg1")
    private String msg3;
    @Autowired
    @Qualifier("msg2")
    private String msg4;
    @Value("${number.display}")
    private int number;

    public void display(){
        System.out.println(msg);
        System.out.println("msg1: " + msg3);
        System.out.println("msg2: " + msg4);
        System.out.println(number+1);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
