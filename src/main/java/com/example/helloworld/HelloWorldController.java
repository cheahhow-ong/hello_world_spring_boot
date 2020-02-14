package com.example.helloworld;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
//    @RequestMapping("/hello")
    @GetMapping("/test")
    @ResponseBody
    public String sayHello(){
        return "Hello world Developer!!!";
    }
}
