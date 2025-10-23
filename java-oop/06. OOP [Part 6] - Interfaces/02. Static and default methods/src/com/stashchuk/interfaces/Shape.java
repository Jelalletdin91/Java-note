package com.stashchuk.interfaces;

public interface Shape extends humanity{

    double calculatePerimeter();

    default void describeShape() {
        System.out.println("Description of Shape:");
        System.out.println("A geometric figure such as square, triangle or rectangle");
    }

    static void compareAreas(Shape shape1, Shape shape2) {
        double shape1Area = shape1.calculateArea();
        double shape2Area = shape2.calculateArea();

        if (shape1Area > shape2Area) {
            System.out.println("Shape 1 has larger area");
        } else if (shape1Area < shape2Area) {
            System.out.println("Shape 2 has larger area");
        } else {
            System.out.println("Both shapes have equal areas");
        }
    }
}
