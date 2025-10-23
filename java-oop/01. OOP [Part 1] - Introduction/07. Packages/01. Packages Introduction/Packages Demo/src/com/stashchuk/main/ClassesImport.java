package com.stashchuk.main;

import com.stashchuk.shapes.Circle;    // import Circle class
import com.stashchuk.shapes.Rectangle; // import Rectangle class
import com.stashchuk.shapes.Square;    // import Square class

import java.text.DecimalFormat; // import built-in DecimalFormat class

public class ClassesImport {
    public static void main(String[] args) {

        // Rectangle
        Rectangle rectangle = new Rectangle(10, 15);
        System.out.println("Rectangle Area: " + rectangle.calculateArea() + " cm");


        // Square
        Square square = new Square(35);
        System.out.println("Square Area: " + square.calculateArea()  + " cm");


        // Circle
        Circle circle = new Circle(5);
        double circleArea = circle.calculateArea();

        // format circle area to have only two digits after the decimal
        DecimalFormat formatter = new DecimalFormat(".##");
        String formattedCircleArea = formatter.format(circleArea);

        System.out.println("Circle Area: " + formattedCircleArea  + " cm");
    }
}
