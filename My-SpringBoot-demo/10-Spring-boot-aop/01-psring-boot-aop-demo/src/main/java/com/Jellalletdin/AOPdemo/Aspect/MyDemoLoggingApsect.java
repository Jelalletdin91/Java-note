package com.Jellalletdin.AOPdemo.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Repository;

@Aspect
@Repository
public class MyDemoLoggingApsect {
    @Pointcut("execution( * com.Jellalletdin.AOPdemo.Dao.*.*(..))")
    public void forDaoPackage(){}

    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice(){
        System.out.println("\n======>>> Executing @Before advice on addAccount");
    }

    @Before("forDaoPackage()")
    public void performAnalytics(){
        System.out.println("\n======>>> Performing API analytics");
    }
}
