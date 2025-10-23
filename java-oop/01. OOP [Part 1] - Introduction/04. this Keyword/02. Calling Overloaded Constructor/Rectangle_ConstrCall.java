public class Rectangle_ConstrCall {
    private double length;
    private double width;

    public Rectangle_ConstrCall() {
        // call the parameterized constructor
        this(15, 10);
    }

    public Rectangle_ConstrCall(double length, double width) {
        // "this" here avoids ambiguity due to naming conflict
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        double area = this.length * this.width;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * (this.length + this.width);
        return perimeter;
    }
}
