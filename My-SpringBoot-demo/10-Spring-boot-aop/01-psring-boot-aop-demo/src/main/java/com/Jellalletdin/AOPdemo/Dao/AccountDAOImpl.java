package com.Jellalletdin.AOPdemo.Dao;

import com.Jellalletdin.AOPdemo.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{
    @Override
    public void addAccount(Account account, boolean vipFlag) {
        System.out.println(getClass() + " DOING MY DG WORK: ADDING AN ACCOUNT");
    }

    @Override
    public boolean doWork() {
        System.out.println(getClass() + " DOING MY DG WORK: ADDING A DO WORK");
        return false;
    }
}
