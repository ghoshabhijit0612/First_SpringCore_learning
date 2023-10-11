package com.example.SpringMVCProject.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {
    @GetMapping("getProduct")
    public String getProduct(
            @RequestParam("productName") String name,
            @RequestParam("productId") int id,
            @RequestParam("productRating") int rate
    ){
        System.out.println(name);

        System.out.println(id);
        System.out.println(rate);
        return "suceessfully";
    }

}
