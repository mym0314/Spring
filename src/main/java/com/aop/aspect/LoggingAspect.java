package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* com.aop.customer.bo.CustomerBo.addCustomer(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("logBefore() is running ");
        System.out.println("hijacked :"+joinPoint.getSignature().getName());
        System.out.println("*******");
    }
}
