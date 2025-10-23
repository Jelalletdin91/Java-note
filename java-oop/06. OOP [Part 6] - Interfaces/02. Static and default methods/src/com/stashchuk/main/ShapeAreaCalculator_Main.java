package com.stashchuk.main;

import com.stashchuk.implementations.Circle;
import com.stashchuk.implementations.Rectangle;
import com.stashchuk.implementations.Square;
import com.stashchuk.implementations.Triangle;
import com.stashchuk.interfaces.Shape;

public class ShapeAreaCalculator_Main {
    public static void main(String[] args) {

        Shape circle = new Circle(20);
        Shape square = new Square(30);
        Shape rectangle = new Rectangle(15, 25);
        Shape triangle = new Triangle(4, 7, 10);

        // default method call
        circle.describeShape();

        System.out.println();

        // static method call
        Shape.compareAreas(rectangle, circle);
        Shape.compareAreas(triangle, square);

        System.out.println();

        // array of shapes
        Shape[] shapes = { circle, square, rectangle, triangle };
        for (Shape shape : shapes) {
            System.out.println("Shape area is " + shape.calculateArea() + " and perimeter is " + shape.calculatePerimeter());
        }
    }
}

