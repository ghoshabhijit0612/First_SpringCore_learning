package com.example.SpringMVCProject.Controler;

import com.example.SpringMVCProject.Controler.Student.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
public class studentDetails {

//    @PostMapping ("/create")
//    public String  getCreate(@RequestBody Map<String, Objects> data){
//        System.out.println("xx");
//        return "create";
//    }

    //    @PostMapping("/create")
//    public String createStudent(@RequestBody Map<String, Object>request) {
//        // Handle the request here
////        System.out.println("Received request: " + request.toString());
////        for(/)
//        System.out.println(request);
//        String s = (String) request.get("name");
//        System.out.println(s);
//        return "create";
//    }
    @PostMapping("/create")
    public ResponseEntity<List<Student>> getCreate(@RequestBody List<Student> s) {
        System.out.println(s.get(0));
//            System.out.println(s.getRoll/());
        List<Student> createdStudents = new ArrayList<>();

        for (Student student : s) {
            // You can perform any required processing here
            System.out.println("Received student: " + s);
            // Add the student to the list of created students
            createdStudents.add(student);
        }

        ResponseEntity<List<Student>> res = new ResponseEntity<>(createdStudents, HttpStatus.CREATED);
        return res;
    }


}
