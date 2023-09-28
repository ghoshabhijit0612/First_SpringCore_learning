package com.example.FirstSpringDemo1.Pepsi;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component

public class HelloPepsi {
    @Autowired
    public HelloPepsi(){
        System.out.println("i am pepsi...");
    }
    @PostConstruct
    public void eat(){
        System.out.println("i am eating pepsi");
    }

    @PreDestroy
    public void preDestroy(){

        System.out.println("i am Predestroy...****");

    }
}
