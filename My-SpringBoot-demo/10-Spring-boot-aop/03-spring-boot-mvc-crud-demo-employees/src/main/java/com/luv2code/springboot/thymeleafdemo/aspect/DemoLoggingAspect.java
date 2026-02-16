package com.luv2code.springboot.thymeleafdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.naming.event.ObjectChangeListener;
import java.util.logging.Logger;

@Aspect
@Component
public class DemoLoggingAspect {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Pointcut("execution (* com.luv2code.springboot.thymeleafdemo.controller.*.*(..))")
    private void forController(){}

    @Pointcut("execution (* com.luv2code.springboot.thymeleafdemo.service.*.*(..))")
    private void forService(){}

    @Pointcut("execution (* com.luv2code.springboot.thymeleafdemo.dao.*.*(..))")
    private void forDao(){}


    @Pointcut("forDao() || forService() || forController()")
    private void forAppFlow(){}

    @Before("forAppFlow()")
    private void before(JoinPoint joinPoint){

        String method = joinPoint.getSignature().toShortString();

        logger.info("===>>> in @Before calling method: " + method);

        Object[] args =joinPoint.getArgs();

        for (Object arg : args){
            logger.info("===>>> argument: " + arg);
        }

    }

    @AfterReturning(pointcut = "forAppFlow()" , returning = "result")
    private void afterReturning(JoinPoint joinPoint, Object result){

        String method = joinPoint.getSignature().toShortString();
        logger.info("===>>> in @After Returning calling method: " + method);

        logger.info("reuslt " + result);

    }

}
