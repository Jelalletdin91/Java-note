package com.Jellalletdin.AOPdemo.Dao;

import com.Jellalletdin.AOPdemo.Account;

public interface AccountDAO {

    void addAccount(Account account, boolean vipFlag);

    boolean doWork();
}
