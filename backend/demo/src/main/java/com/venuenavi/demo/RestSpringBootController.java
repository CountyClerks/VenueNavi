package com.venuenavi.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import java.net.http.HttpRequest;

@RestController
public class RestSpringBootController {
    
    @RequestMapping("/hello")
    public String hello() {
        return "Hello world";
    }

    @GetMapping(value = "/callclienthello")
    private String getHelloClient() {
        String uri = "http://localhost:8080/hello";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    
}
