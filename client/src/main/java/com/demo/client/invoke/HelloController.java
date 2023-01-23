package com.demo.client.invoke;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    private TestService testService;


    @GetMapping("/hello")
    public String  hello(){
        String hello = testService.hello();
        log.error("打印log{}",hello);
        return hello;
    }


    @GetMapping("/a")
    public String list(){
        String s = testService.listOrder();
        return s;
    }
    @GetMapping("/b")
    public String add(){
        String s = testService.addToCart(4);
        return s;
    }
    @GetMapping("/c")
    public String deduct(){
        String s = testService.deduct(5);
        return s;
    }
}
