package com.stashchuk.implementations;

import com.stashchuk.interfaces.Shape;

public class Triangle implements Shape {
    private final double side1;
    private final double side2;
    private final double base;

    public Triangle(double side1, double side2, double base) {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + base) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - base)); // Heron's formula
        return Math.round(area * 10.0) / 10.0; // Rounds to 1 decimal place
    }

    @Override
    public double calculatePerimeter() {
        return this.side1 + this.side2 + this.base;
    }
}
