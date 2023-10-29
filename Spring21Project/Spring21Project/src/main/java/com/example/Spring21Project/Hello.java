package com.example.Spring21Project;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Hello {
    @RequestMapping("/hello")
    @ResponseBody
    public String getHello(){

        System.out.println("HEllo world");
        return "about";
    }
    @GetMapping("/get-map")
    public String setMapimg(){
        System.out.println("what is happen");
        return "hwllo world i am hulo";
    }

    @PostMapping("/login")
    public  String getLogin (@RequestBody Map<String , Object> data){
        System.out.println(data);
        for (String key : data.keySet()) {
            Object value = data.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        return "x";

    }
}
