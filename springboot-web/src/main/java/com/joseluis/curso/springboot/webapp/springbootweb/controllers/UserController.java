package com.joseluis.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.joseluis.curso.springboot.webapp.springbootweb.models.User;

@Controller
public class UserController {
 
    @GetMapping("/details")
    public String details(Model model){
        User user = new User("José Luis", "Hurtado Villa");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user",user);
        return "details";
    }
}
