package com.Jelalletdin.springboot.demo.MyApplication.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FunRestController {
    //expose "/" that return "Hello World"

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")

    public String hello(){
        return "Hello World";
    }

    @GetMapping("/team")
    public String getTeamInfo(){
        return "Coach Name: " + coachName + ", team Name: " + teamName;
    }

    //expose  a new endpoint for "workflow"




}
