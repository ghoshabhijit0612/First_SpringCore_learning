package com.example.SpringMVCProject.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class byeBye {
    @RequestMapping("bye")
    @ResponseBody
    public String getbyeBye(){
        return "i am response body ";
    }
}
