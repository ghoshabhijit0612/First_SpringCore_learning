package com.example.ToDoApplication.Controller;

import com.example.ToDoApplication.config.securityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.PseudoColumnUsage;
import java.util.Arrays;
import java.util.List;
@RestController
public class homeController

{
    @Autowired
    public securityConfig x;

    @Value("${xxx.xx.x}")
    public String s;

    @RequestMapping("/todos")
    public List<String> asLists(){

        List<String> list = Arrays.asList("Hello","i am ", "Abhijit Ghoh","aftewr updte","heyok");
        return list;
    }
    @RequestMapping("/xxx")
    public String getXxxValue(){
        return this.s;
    }
    @RequestMapping("/hello")
    public securityConfig getConfig(){
        return this.x;
    }
}
