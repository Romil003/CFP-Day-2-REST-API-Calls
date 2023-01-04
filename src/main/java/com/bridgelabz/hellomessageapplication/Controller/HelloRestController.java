package com.bridgelabz.hellomessageapplication.Controller;


import com.bridgelabz.hellomessageapplication.Model.User;
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

    @PostMapping("/user")
    public String helloWithFullName(@RequestBody User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz !!!";
    }
}
