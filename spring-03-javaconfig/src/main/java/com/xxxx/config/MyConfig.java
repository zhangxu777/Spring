package com.xxxx.config;

import com.xxxx.pojo.Cat;
import com.xxxx.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    
    @Bean
    public Cat cat(){
        return new Cat();
    }

    @Bean
    public User user(){
        return new User();
    }
}
