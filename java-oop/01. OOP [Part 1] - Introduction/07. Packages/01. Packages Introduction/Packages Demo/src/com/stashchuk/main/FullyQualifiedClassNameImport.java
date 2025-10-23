package com.stashchuk.main;

import java.text.DecimalFormat; // import built-in DecimalFormat class

public class FullyQualifiedClassNameImport {
    public static void main(String[] args) {

        // Rectangle
        com.stashchuk.shapes.Rectangle rectangle = new com.stashchuk.shapes.Rectangle(10, 15);
        System.out.println("Rectangle Area: " + rectangle.calculateArea() + " cm");


        // Square
        com.stashchuk.shapes.Square square = new com.stashchuk.shapes.Square(35);
        System.out.println("Square Area: " + square.calculateArea()  + " cm");


        // Circle
        com.stashchuk.shapes.Circle circle = new com.stashchuk.shapes.Circle(5);
        double circleArea = circle.calculateArea();

        // format circle area to have only two digits after the decimal
        DecimalFormat formatter = new DecimalFormat(".##");
        String formattedCircleArea = formatter.format(circleArea);

        System.out.println("Circle Area: " + formattedCircleArea  + " cm");
    }
}
