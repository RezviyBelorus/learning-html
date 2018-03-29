package spring4pro.initdestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class A {
    private String name;
    private int age;

    @PostConstruct
    private void init(){
        name = "Alex";
        age = 29;
    }

    public void display(){
        System.out.println(name);
        System.out.println(age);
    }

    @PreDestroy
    private void destroy(){
        System.out.println("Method destroy");
    }
}
