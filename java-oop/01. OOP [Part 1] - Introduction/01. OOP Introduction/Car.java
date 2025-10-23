public class Car {

    // instance fields
    private String model;
    private String color;
    private double price;    // price in dollars
    private int horsePower;
    private double weightKg; // weight in kilograms

    // constructor
    public Car() {
        // assign default values
        model = "Toyota Corolla 2010";
        color = "white";
        price = 30000;
        horsePower = 300;
        weightKg = 2000;
    }

    // instance methods
    public void start() {
        System.out.println("car started - ready to drive...");
    }

    public void stop() {
        System.out.println("applying brakes... car stopped");
    }

    public void drive() {
        System.out.println("driving car...");
    }

    public String getModel() {
        return model;
    }
}
