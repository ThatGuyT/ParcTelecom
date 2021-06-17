package com.banque.ParcTelecom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTest {
    @GetMapping("/")
    private String hello(){
        return "salut";
    }
}
