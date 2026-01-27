package Jelalletdin_demo.demo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Pull Up every day";
    }



}
