package com.Jelalletdin.securitydemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/myLoginPage")
    public String myLoginPage(){
        return "fancy-login";
    }

    @GetMapping("/access-denied")
    public String accessDeniedPage(){
        return "access-denied";
    }


}
