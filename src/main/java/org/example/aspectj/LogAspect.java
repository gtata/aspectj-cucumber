package org.example.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.example.domain.Request;
import org.example.domain.Response;

@Aspect
public class LogAspect {

    @Pointcut("execution(*  org.example.Calculator.*(..))")
    public void methodLoggingExecution() {};

    @Before("methodLoggingExecution()")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("About to execute method ==> [ " + joinPoint.getSignature() + " ]");
        System.out.println("Hello will be said " + ((Request)joinPoint.getArgs()[0]).getCount() + " time(s)");
        System.out.println("The numbers [" + ((Request)joinPoint.getArgs()[0]).getArg1() + "] and [" + ((Request)joinPoint.getArgs()[0]).getArg2() + "] will be added");
    }

    @After("methodLoggingExecution()")
    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println("Done executing method ==> [ " + joinPoint.getSignature() + " ]");
    }

    @AfterReturning(pointcut = "methodLoggingExecution()", returning = "result")
    public void afterReturningAdvice(JoinPoint joinPoint, Object result) {
        System.out.println("Return value from method execution is ==> [ " + ((Response)result).getResult() + " ]");
    }
}
