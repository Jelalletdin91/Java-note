package Jelalletdin_demo.demo.rest;

import Jelalletdin_demo.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoRestCOntroller {
    private Coach myCoach;

    @Autowired
    public void setCoach(Coach theCoach){
        myCoach=theCoach;
    }

    @GetMapping("/")
    public String hello(){
        return "HELLO";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
