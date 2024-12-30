package com.example.myproducts;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/home")
//    @ResponseBody
    public String greet() {
        return "Welcome to Products Wirehouse";
    }

    @RequestMapping("/about")
//    @ResponseBody // because the rest controller search for a page search for
    public String about(){
        return "Its all about what you wish";
    }
}
