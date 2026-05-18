package com.anjan.hello.world.api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World! My first Spring Boot API is live!";

    }
    @GetMapping("/info")
    public String info(){
        return "Developer: Anjan | Stack: Java + Spring Boot | Day: 1";
    }
    @GetMapping("/Welcome")
    public String Welcome(){
        return "Welcome to my springboot journey ";
    }
}
