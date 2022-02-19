package com.xxxx.config;

import com.xxxx.handle.MyAspect;
import com.xxxx.service.SomeService;
import com.xxxx.service.impl.SomeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Configuration
public class MyConfig {

    @Bean(name = "some")
    public SomeServiceImpl someService(){return new SomeServiceImpl(); };

    @Bean
    public MyAspect myAspect(){return new MyAspect(); }


}
