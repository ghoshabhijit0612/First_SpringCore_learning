package com.example.FirstSpringDemo1.Animal;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{
public void  play(){
    System.out.println("Hello i am cat ");
}
}
