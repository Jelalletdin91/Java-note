package com.stashchuk.shapes;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2); // alternative: Math.PI * (this.radius, this.radius)
    }
}
