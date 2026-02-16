package com.Jellalletdin.AOPdemo.Dao;

import com.Jellalletdin.AOPdemo.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Account> findAccounts(boolean tripWire) {

        if (tripWire){
            throw new RuntimeException("No soup");
        }

        List<Account> myAccounts = new ArrayList<>();

        Account temp1= new Account("Aly", "Asyrov");
        Account temp2 = new Account("Jelalletdin", "Berjanov");
        Account temp3 = new Account("Oraz", "Bayjayev");

        myAccounts.add(temp1);
        myAccounts.add(temp2);
        myAccounts.add(temp3);

        return myAccounts;
    }

    @Override
    public List<Account> findAccounts() {

        return findAccounts(false);
    }


}
