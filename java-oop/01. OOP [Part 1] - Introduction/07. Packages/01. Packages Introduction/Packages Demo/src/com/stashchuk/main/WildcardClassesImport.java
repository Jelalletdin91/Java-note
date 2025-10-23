package com.stashchuk.main;

import com.stashchuk.shapes.*; // import all classes inside "com.stashchuk.shapes"

import java.text.DecimalFormat; // import built-in DecimalFormat class
import java.util.Scanner;


public class WildcardClassesImport {
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

         java.util.Scanner input=new  java.util.Scanner(System.in);
         int a= input.nextInt();
        System.out.println(a);
    }
}
