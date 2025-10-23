public class Car_Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        myCar.stop();
        myCar.start();

        System.out.println(myCar.getModel());
    }
}
