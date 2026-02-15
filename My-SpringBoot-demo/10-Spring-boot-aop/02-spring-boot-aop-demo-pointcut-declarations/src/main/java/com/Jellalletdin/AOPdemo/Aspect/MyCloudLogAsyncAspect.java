package com.Jellalletdin.AOPdemo.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class MyCloudLogAsyncAspect {
    @Before("com.Jellalletdin.AOPdemo.Aspect.AopExpressions.forDaoPackageNoGetterSetter()")
    public void loggingCloudAsync(){
        System.out.println("\n======>>> Logging Cloud");
    }
}
