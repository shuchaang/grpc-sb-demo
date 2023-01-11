package com.demo.client.invoke;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private TestService testService;


    @GetMapping("/hello")
    public String  hello(){
        String hello = testService.hello();
        return hello;
    }
}
