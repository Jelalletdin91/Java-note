package com.stashchuk.implementations;

import com.stashchuk.interfaces.Shape;

public class Thing implements Shape {
    private int cal;

    public Thing(int cal){
        this.cal=cal;
    }

    @Override
    public double calculateArea() {

        return cal+10;
    }

    @Override
    public double calculatePerimeter() {

        return cal+45;
    }
}
