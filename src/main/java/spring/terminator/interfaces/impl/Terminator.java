package spring.terminator.interfaces.impl;

import spring.terminator.annotation.InjectInt;
import spring.terminator.interfaces.Quoter;

import javax.annotation.PostConstruct;

public class Terminator implements Quoter {
    private String message;

    @InjectInt(min = 2, max = 7)
    private int repeat;

    public Terminator(String message) {
        System.out.println("Main constructor");
        this.message = message;
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct");
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
