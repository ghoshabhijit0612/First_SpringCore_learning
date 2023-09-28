package com.example.FirstSpringDemo1;

import com.example.FirstSpringDemo1.Animal.Person;
import com.example.FirstSpringDemo1.Animal.Samosa;
import com.example.FirstSpringDemo1.Pepsi.HelloPepsi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstSpringDemo1Application {

	public static void main(String[] args) {


	ApplicationContext context =  SpringApplication.run(FirstSpringDemo1Application.class, args);
//	Person p = context.getBean(Person.class);
//	p.playwithAnimal();
		HelloPepsi epep;
		epep = context.getBean(HelloPepsi.class);
		System.out.println(epep);
//		epep.eat();
		//2nd time create
		HelloPepsi epep1 = context.getBean(HelloPepsi.class);
		System.out.println(epep1);
//		epep1.eat();



	}
//	@Bean
//	public Samosa getSamosa() {
//		return new Samosa();
//	}

}
