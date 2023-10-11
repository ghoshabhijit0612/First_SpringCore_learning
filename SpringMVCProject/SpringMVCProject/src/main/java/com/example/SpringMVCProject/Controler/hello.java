package com.example.SpringMVCProject.Controler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//@RestController
//@RequestMapping
@RestController
public class hello {

    @RequestMapping("/")
    public String getHello(){
        return "login";
    }
    @RequestMapping("/admin")
    public String getAdmin(){
        return "admin i love you";
    }
    @RequestMapping("/login.html")
    public  String getLogin(){
        return getHello();
    }

//    @RequestMapping(value="/get-list", method= RequestMethod.GET)
//    public List<String> getList(){
//        return Arrays.asList("Hello","i am ","abhijit");
//    }


}
