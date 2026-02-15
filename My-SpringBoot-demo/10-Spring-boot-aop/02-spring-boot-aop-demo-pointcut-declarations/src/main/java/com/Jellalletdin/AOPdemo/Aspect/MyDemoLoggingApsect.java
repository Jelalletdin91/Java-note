package com.Jellalletdin.AOPdemo.Aspect;

import com.Jellalletdin.AOPdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

@Aspect
@Repository
@Order(-64681348)
public class MyDemoLoggingApsect {


    @Before("com.Jellalletdin.AOPdemo.Aspect.AopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint){
        System.out.println("\n======>>> Executing @Before advice on addAccount");


        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("Method: " + methodSignature);

        Object [] args = joinPoint.getArgs();

        for (Object arg : args){

            System.out.println(arg);

            if (arg instanceof Account){

                Account account = (Account) arg;

                System.out.println("Name1: " + account.getName1());
                System.out.println("Name2: " + account.getName2());

            }

        }

    }





}
