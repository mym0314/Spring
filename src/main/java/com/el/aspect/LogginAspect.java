package com.el.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
public class LogginAspect {
    @Before("execution(* com.el.bean.Customer.getItemName(..))")
    public void LogBefore(JoinPoint joinPoint){
        System.out.println("JoinPoint() is running");
        System.out.println("LogginAspect:"+joinPoint.getSignature().getName());
        System.out.println("******************");

    }
}
