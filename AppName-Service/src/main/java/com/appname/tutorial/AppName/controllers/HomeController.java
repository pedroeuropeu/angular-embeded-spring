package com.appname.tutorial.AppName.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HomeController
{
    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }
}
