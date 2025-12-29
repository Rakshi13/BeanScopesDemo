package com.example.demo.Controller;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TestController2 {

    @Autowired
    User user;

    public TestController2(){
        System.out.println("test Controller2 is initialized.");
    }

    @PostConstruct
    public void init(){
        System.out.println("test Controller 2 HashCode :"+this.hashCode()+"User hashCode is :"+user.hashCode());
    }
}
