public class RectangleFields_Main {
    public static void main(String[] args) {
        RectangleFields rectangle = new RectangleFields();

        double rectangleArea = rectangle.calculateArea();
        System.out.println("Rectangle Area: " + rectangleArea);

        double rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);
    }
}
