public class Rectangle_ConstrCall_Main {
    public static void main(String[] args) {
        Rectangle_ConstrCall smallRectangle = new Rectangle_ConstrCall();

        System.out.println("Rectangle Area (small): " + smallRectangle.calculateArea());
        System.out.println("Rectangle Perimeter (small): " + smallRectangle.calculatePerimeter());


        Rectangle_ConstrCall largeRectangle = new Rectangle_ConstrCall(150, 10);

        System.out.println("\nRectangle Area (large): " + largeRectangle.calculateArea());
        System.out.println("Rectangle Perimeter (large): " + largeRectangle.calculatePerimeter());
    }
}
