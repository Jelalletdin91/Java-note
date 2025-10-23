public class Car_AccessModifiers_Main {
    public static void main(String[] args) {
        Car_AccessModifiers myCar = new Car_AccessModifiers();

        // ERROR - cannot directly access private fields
        //System.out.println(myCar.model);

        // accessing private field indirectly through a public method
        String carModel = myCar.getModel();
        System.out.println("Model: " + carModel);

        // accessing public field directly
        System.out.println("No. of air bags: " + myCar.airbagsCount);

    }
}
