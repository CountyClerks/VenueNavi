package com.venuenavi.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestSpringBootController {
    
    @RequestMapping("/hello")
    public String hello() {
        return "Hello world";
    }
    
}
