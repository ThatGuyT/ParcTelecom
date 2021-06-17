package com.banque.ParcTelecom.controller;

import com.banque.ParcTelecom.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/login")
    public String login(){
        return "testLogin";
    }

    @GetMapping ("/register")
    public  String getFram(){
        return "testRegister";
    }
    @PostMapping("/register")
    public  String register(String userName,String email, String password){
        userService.register(userName, email,password);
        return "testLogin";
    }
}
