package com.xxxx.handle;

import com.xxxx.service.impl.SomeServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
public class MyAspect {

//    @Before(value = "execution(void com.xxxx.service.impl.SomeServiceImpl.do*(..))")
//    public void myBefore(JoinPoint jp){
//        System.out.println(jp.getSignature().getName());
////        Object jpArgs[] = jp.getArgs();
////        for (Object jpArg : jpArgs) {
////            System.out.println(jpArg);
////        }
//        if (jp.getSignature().getName().equals("doSome")){
//            System.out.println("Yes! doSome");
//        } else if (jp.getSignature().getName().equals("doOther")){
//            System.out.println("Yes! doOther");
//        }
//        System.out.println("Aspect MyBefore");
//    }
//    @AfterReturning(value = "execution(* *..SomeServiceImpl.do*(..))",returning = "res")
//    public void myAfterRe(Object res){
//        if (res != null){
//            res = "Hello Res";
//            System.out.println(res);
//        }
//
//        System.out.println(res);
//
//    }
    @Around(value = "execution(* *..SomeServiceImpl.do*(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Print Aspect Around");
        Object method;
        method = pjp.proceed();
        //System.out.println(pjp.getArgs());
        Object args[] = pjp.getArgs();
        for (Object arg : args) {
            System.out.println(args[0]);
        }

        // return "return Aspect Around";
        return method;

    }
}
