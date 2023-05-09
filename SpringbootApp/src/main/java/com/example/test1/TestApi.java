package com.example.test1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

    @GetMapping("/")
    public String defaultValue(){
        return "Hello world";
    }
//    @GetMapping("/test")
//    public String outputTest(){
//        return "Hello world, this is a test";
//    }
}
