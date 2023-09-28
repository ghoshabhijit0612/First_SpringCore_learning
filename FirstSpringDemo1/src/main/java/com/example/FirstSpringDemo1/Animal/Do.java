package com.example.FirstSpringDemo1.Animal;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Do implements Animal{
    public Do(){
        System.out.println("Dog constrcutor is calling....");
    }
public void play(){
    System.out.println("Hello i am dog ");
}
}
