package com.Jellalletdin.AOPdemo.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Repository;

@Aspect
@Repository
public class MyDemoLoggingApsect {
    //@Before("execution(public void com.Jellalletdin.AOPdemo.Dao.AccountDAO.addAccount())")
   // @Before("execution(public void updateAccount())")
    //@Before("execution(public void add*())")
    //@Before("execution( void add*())")
    //@Before("execution( * add*())")
    //@Before("execution( * add*(com.Jellalletdin.AOPdemo.Account, ..))")

    @Before("execution( * com.Jellalletdin.AOPdemo.Dao.*.*(..))")
    public void beforeAddAccountAdvice(){
        System.out.println("\n======>>> Executing @Before advice on addAccount");
    }


}
