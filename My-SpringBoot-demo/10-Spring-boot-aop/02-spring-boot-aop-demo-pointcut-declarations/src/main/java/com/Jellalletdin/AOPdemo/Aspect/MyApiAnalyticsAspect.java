package com.Jellalletdin.AOPdemo.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(64681348)
public class MyApiAnalyticsAspect {

    @Before("com.Jellalletdin.AOPdemo.Aspect.AopExpressions.forDaoPackageNoGetterSetter()")
    public void performAnalytics(){
        System.out.println("\n======>>> Performing API analytics");
    }
}
