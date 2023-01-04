package com.bridgelabz.hellomessageapplication.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping("/say")
    public String sayHello() {
        return "Hello from BridgeLabz!!!";
    }

    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam String name){
        return "Hello " + name + " from BridgeLabz !!!";
    }
}
