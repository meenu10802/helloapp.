package org.example.helloapp;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // UC1
    @GetMapping("")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}