package Jelalletdin_demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoRestCOntroller {

    //define private field for dependency
    private Coach myCoach;

    @Autowired

    public demoRestCOntroller(Coach theCoach){
        myCoach=theCoach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
