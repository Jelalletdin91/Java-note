package com.Jellalletdin.AOPdemo.Service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class TrafficFortuneImpl implements TrafficFortune{


    @Override
    public String getFortune() {

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "Expect heavy traffic today";

    }

    @Override
    public String getFortune(boolean tripWire) {

        if (tripWire){
            throw new RuntimeException("Major Accident! Highway is closed");
        }

        return getFortune();
    }
}
