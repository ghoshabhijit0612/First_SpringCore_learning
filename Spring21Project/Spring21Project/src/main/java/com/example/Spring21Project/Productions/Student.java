package com.example.Spring21Project.Productions;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


public class Student {
    String name;
    String StdId;
    int roll;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStdId() {
        return StdId;
    }

    public void setStdId(String stdId) {
        StdId = stdId;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", StdId='" + StdId + '\'' +
                ", roll=" + roll +
                '}';
    }
}
