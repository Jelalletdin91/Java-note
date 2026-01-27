package com.Jelalletdin.springboot.demo.MyApplication.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FunRestController {
    //expose "/" that return "Hello World"

    @GetMapping("/")

    public String hello(){
        return "Hello World";
    }

    //expose  a new endpoint for "workflow"

    @GetMapping ("/workflow")
    public String workflow(){
        return "It is Workflow";
    }


}
