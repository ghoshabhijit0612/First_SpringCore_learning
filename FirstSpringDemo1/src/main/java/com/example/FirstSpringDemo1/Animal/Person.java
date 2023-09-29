package com.example.FirstSpringDemo1.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

//@Component
public class Person
{
//@Autowired
Animal a;



    //contructor based injection

    public Person (Animal a){
    this.a=a;
    System.out.println("Person contructor is calling ");
    System.out.println("heLLO ");
}
//@Autowired
public void setter(Animal a){
        this.a=a;
    System.out.println("i am inside setter...");
}

public void playwithAnimal(){
    System.out.println("i am indiaplaywithAnimal....");
    a.play();

}


}
