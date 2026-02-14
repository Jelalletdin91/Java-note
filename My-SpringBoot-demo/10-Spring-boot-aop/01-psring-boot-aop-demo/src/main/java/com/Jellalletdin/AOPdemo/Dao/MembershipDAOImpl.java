package com.Jellalletdin.AOPdemo.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO{
    @Override
    public boolean addMember() {
        System.out.println(getClass() + " DOING MY DG WORK: ADDING A MEMBERSHIP ACCOUNT");

        return true;
    }

    @Override
    public void goToSleep() {
        System.out.println(getClass() + " DOING MY DG WORK: ADDING A GO TO SLEEP");
    }
}
