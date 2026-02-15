package com.Jellalletdin.AOPdemo.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {

    @Pointcut("execution( * com.Jellalletdin.AOPdemo.Dao.*.*(..))")
    public void forDaoPackage(){}

    @Pointcut("execution( * com.Jellalletdin.AOPdemo.Dao.*.get*(..))")
    public void getter(){}


    @Pointcut("execution( * com.Jellalletdin.AOPdemo.Dao.*.set*(..))")
    public void setter(){}

    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter(){}

}
