package com.example.springTraining.configs;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
public class UseScheduled {

    @Scheduled(fixedRate = 2000)
    public void testScheduling(){
        System.out.println("Test Scheduling");
    }

}