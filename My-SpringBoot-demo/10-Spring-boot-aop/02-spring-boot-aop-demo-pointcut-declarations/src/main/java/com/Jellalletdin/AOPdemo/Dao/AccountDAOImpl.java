package com.Jellalletdin.AOPdemo.Dao;

import com.Jellalletdin.AOPdemo.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{

    private String Name;

    private String ServiceCode;

    @Override
    public void addAccount(Account account, boolean vipFlag) {
        System.out.println(getClass() + " DOING MY DG WORK: ADDING AN ACCOUNT");
    }

    @Override
    public boolean doWork() {
        System.out.println(getClass() + " DOING MY DG WORK: ADDING A DO WORK");
        return false;
    }

    public String getName() {
        System.out.println(getClass() + " DOING MY DG WORK ON getName()");
        return Name;
    }

    public void setName(String name) {
        System.out.println(getClass() + " DOING MY DG WORK ON setName()");
        Name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass() + " DOING MY DG WORK ON getServiceCode()");
        return ServiceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + " DOING MY DG WORK ON SetServiceCode()");
        ServiceCode = serviceCode;
    }
}
