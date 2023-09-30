package config.xml.beans;

import ConfigClass.configg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String args[]){
        System.out.println("helllo world");
        ApplicationContext context = new ClassPathXmlApplicationContext("config/xml/beans/config.xml");
        Student x = context.getBean(Student.class);
    x.getAttendence();
    }
}
