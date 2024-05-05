package com.example.classdemoproject;

import org.springframework.web.bind.annotation.*;

@RestController

//localHost:8080/api/hello
@RequestMapping("/api")
public class controller {

  //  @GetMapping("/hello")

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello get!";
    }
    @PostMapping("/hello")
    public String sayHelloPost() {
        return "Hello post!";
    }
    @PatchMapping("/hello")
    public String sayHelloPatch() {
        return "Hello!";
    }
    @DeleteMapping("/hello")
    public String sayHelloDelete() {
        return "Hello!";
    }
    @RequestMapping("/bye/{name}")
    public String bye(@PathVariable("name") String name) {
        return "Bye.."+name;
    }
}
