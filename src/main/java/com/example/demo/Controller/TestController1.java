package com.example.demo.Controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("session")
@RequestMapping(value = "/api/")
public class TestController1 {

    @Autowired
    User user;

    @Autowired
    TestController2 testController2;

    public TestController1(){
        System.out.println("TestController1 is initialized:");
    }

    @PostConstruct
    public void init(){
        System.out.println("testController Object HashCode : "+this.hashCode());
    }

    @GetMapping(value = "/fetchUser")
    public ResponseEntity<String> getUserDetails(){
        System.out.println("test API invoked");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }

}
