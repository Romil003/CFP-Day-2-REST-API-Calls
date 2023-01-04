package com.bridgelabz.hellomessageapplication.Controller;


import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/query/{name}")
    public String sayHelloWithName2(@PathVariable String name){
        return "Hello " + name + " from BridgeLabz !!!";
    }
}
