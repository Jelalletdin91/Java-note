package com.stashchuk.main;

import com.stashchuk.implementations.*;
import com.stashchuk.interfaces.Shape;

public class ShapeAreaCalculator_Main {
    public static void main(String[] args) {

        Shape circle = new Circle(20);
        Shape square = new Square(30);
        Shape rectangle = new Rectangle(15, 25);
        Shape triangle = new Triangle(4, 7, 10);
        Shape thing =new Thing(25);

        // circle
        System.out.println("Area of circle (cm): " + circle.calculateArea());
        System.out.println("Circumference of a circle (cm): " + circle.calculatePerimeter());

        System.out.println();

        // square
        System.out.println("Area of square (cm): " + square.calculateArea());
        System.out.println("Perimeter of a square (cm): " + square.calculatePerimeter());

        System.out.println();

        // rectangle
        System.out.println("Area of rectangle (cm): " + rectangle.calculateArea());
        System.out.println("Perimeter of a rectangle (cm): " + rectangle.calculatePerimeter());

        System.out.println();

        // triangle
        System.out.println("Area of triangle (cm): " + triangle.calculateArea());
        System.out.println("Perimeter of a triangle (cm): " + triangle.calculatePerimeter());

        System.out.println();

        System.out.println("Area of thing (cm):" + thing.calculateArea());
        System.out.println("Perimeter of a thing (cm): " + thing.calculatePerimeter());
    }
}

