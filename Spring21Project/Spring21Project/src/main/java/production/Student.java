package production;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/lol")
public class Student {
    @PostMapping("/login-student")
    public  String getLogin (@RequestBody Map<String , Object> data){
        System.out.println(data);
        return "x";

    }

}
