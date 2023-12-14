package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component // added to make available for injection
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
