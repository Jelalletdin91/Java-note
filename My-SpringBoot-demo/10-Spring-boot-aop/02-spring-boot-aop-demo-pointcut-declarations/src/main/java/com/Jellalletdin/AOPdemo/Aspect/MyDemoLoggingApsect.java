package com.Jellalletdin.AOPdemo.Aspect;

import ch.qos.logback.core.joran.spi.NoAutoStartUtil;
import com.Jellalletdin.AOPdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Aspect
@Repository
@Order(-64681348)
public class MyDemoLoggingApsect {
    @Around("execution(* com.Jellalletdin.AOPdemo.Service.*.getFortune(..))")
    public Object aroundFortune(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{

        String method = proceedingJoinPoint.getSignature().toShortString();
        System.out.println("\n=====>>> @Around Method: " + method);

        long begin = System.nanoTime();

        Object result = null;
        try {
           result= proceedingJoinPoint.proceed();

        }catch (Exception e){
            System.out.println(e.getMessage());

            return "Major Accident";
        }

        long end = System.nanoTime();

        long duration = end - begin;

        System.out.println("Duration: " + duration + " nanoseconds");

        return result;
    }

    @After("execution(* com.Jellalletdin.AOPdemo.Dao.AccountDAO.findAccounts(..))")
    public void afterAdvice (JoinPoint joinPoint){
        String method = joinPoint.getSignature().toShortString();
        System.out.println("\n=====>>> @After Method: " + method);
    }

    @AfterThrowing(pointcut = "execution(* com.Jellalletdin.AOPdemo.Dao.AccountDAO.findAccounts(..))", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Throwable e){
        String method = joinPoint.getSignature().toShortString();
        System.out.println("\n=====>>> Method: " + method);

        System.out.println("\\n=====>>> Error is: " + e);

    }

    @AfterReturning(pointcut = "execution(* com.Jellalletdin.AOPdemo.Dao.AccountDAO.findAccounts(..))",
                        returning = "result")
    public void afterReturning(JoinPoint joinPoint, List<Account> result){
        String method = joinPoint.getSignature().toShortString();
        System.out.println("\n=====>>> Method: " + method);

        System.out.println("\n=====>>> Result is: " + result);

        convertAccountNamesToUpperCase(result);
    }

    private void convertAccountNamesToUpperCase(List<Account> result) {

        for (Account account : result){

           String upperName= account.getName1().toUpperCase();

           account.setName1(upperName);

        }


    }


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
