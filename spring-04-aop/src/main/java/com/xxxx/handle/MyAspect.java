package com.xxxx.handle;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
public class MyAspect {

    @Before(value = "execution(void com.xxxx.service.impl.SomeServiceImpl.doSome(String, Integer))")
    public void myBefore(){
        System.out.println("Aspect MyBefore");
    }
}
