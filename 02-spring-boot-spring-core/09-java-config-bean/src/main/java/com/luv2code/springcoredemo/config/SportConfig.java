package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic") // if your remove bean id "aquatic", method name "swimCoach" becomes default id for injection.
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
