package com.example.Spring21Project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import com.example.Spring21Project.Productions.Student;


import java.util.List;


@RestController
public class Hello {

    Logger logger = LoggerFactory.getLogger(Hello.class);
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

//    @PostMapping("/login")
//    public  String getLogin (@RequestBody Map<String , Object> data){
//        System.out.println(data);
//        for (String key : data.keySet()) {
//            Object value = data.get(key);
//            System.out.println("Key: " + key + ", Value: " + value);
//        }
//
//        return "x";
//
//    }
    @PostMapping("/login")
    public Student getStudent(@RequestBody List<Student>students){
        System.out.println("Hello Stident");
//        System.out.println(students.get(0).toString());
        return students.get(0);
    }

    @RequestMapping("/param")
    public String getParam(@RequestParam("Id")  String id,
                           @RequestParam("roll")  int roll,
                           @RequestParam("name")  String name
                           ){
        System.out.println(id+"-"+roll+" -"+name);
//        logger.error(Id : {},Id);

        return "Successfully created param";
    }
    @RequestMapping("log")
    public String getLog(){
        logger.error("Hello");
        logger.warn("Hello is warning");
        logger.info("Hello is finding info");
        return "x";
    }

}
