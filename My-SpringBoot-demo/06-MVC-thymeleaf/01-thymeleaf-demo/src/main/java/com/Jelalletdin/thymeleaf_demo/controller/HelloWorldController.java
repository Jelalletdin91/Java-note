package com.Jelalletdin.thymeleaf_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    //need controller method to show HTML file
    @RequestMapping("/showForm")
    public String helloForm (){
        return "helloWorld-input";
    }

    //need controller method to proces the HTML file
    @RequestMapping("/processForm")
    public  String processForm(){
        return "helloWorld";

    }

    @GetMapping("/processFormv2")
    public String letsShoutDude(HttpServletRequest request, Model model){

        //read the request parameter from HTML
        String theName=request.getParameter("studentName");
        //convert the  data to all caps
        theName=theName.toUpperCase();
        //create the message
        String result = "YO! " + theName;
        //add message to the model
        model.addAttribute("message", result);

        return "helloWorld";
    }

    //Third version
    @PostMapping("/processFormv3")
    public String processFormv3(@RequestParam("studentName") String theName, Model model){

        //read the request parameter from HTML
       // String theName=request.getParameter("studentName");//Instead of thi swe used  (@RequestParam("studentName") String theName,
        //convert the  data to all caps
        theName=theName.toUpperCase();
        //create the message
        String result = "YO! from version 3: " + theName;
        //add message to the model
        model.addAttribute("message", result);

        return "helloWorld";
    }
}
