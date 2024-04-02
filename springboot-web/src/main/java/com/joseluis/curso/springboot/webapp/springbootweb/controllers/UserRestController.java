package com.joseluis.curso.springboot.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joseluis.curso.springboot.webapp.springbootweb.models.User;


@RestController
@RequestMapping("/api")
public class UserRestController {
 
    @GetMapping(path = "/details")
    public Map<String,Object> details(){
        
        User user = new User("José Luis", "Hurtado Villa");
       // User user2 = new User("Pedro Luis", "Pedro");

        Map<String, Object> body = new HashMap<>();
        
        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user);
        //body.put("user2", user2);
        return body;
    }
}
