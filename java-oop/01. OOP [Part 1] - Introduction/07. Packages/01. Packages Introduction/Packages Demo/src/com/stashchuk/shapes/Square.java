package com.stashchuk.shapes;

public class Square {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return this.side * this.side; // alternative using Math class: Math.pow(this.side, 2);
    }
}
