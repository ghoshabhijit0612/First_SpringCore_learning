package com.example.SpringMVCProject.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping
@Controller
public class hello {

    @RequestMapping("/")
    public String getHello(){
        return "login";
    }
    @RequestMapping("/admin")
    public String getAdmin(){
        return "admin";
    }
    @RequestMapping("/login.html")
    public  String getLogin(){
        return getHello();
    }


}
