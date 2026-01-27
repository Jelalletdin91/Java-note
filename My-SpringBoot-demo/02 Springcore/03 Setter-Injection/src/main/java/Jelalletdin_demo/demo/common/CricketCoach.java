package Jelalletdin_demo.demo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Pull Up every day";
    }
}
