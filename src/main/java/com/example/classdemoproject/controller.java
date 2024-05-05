package com.example.classdemoproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

//localHost:8080/api/hello
@RequestMapping("/api")
public class controller {

    @GetMapping("/hello")

//    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello!";
    }
    @RequestMapping("/bye/{name}")
    public String bye(@PathVariable("name") String name) {
        return "Bye.."+name;
    }
}
