public class MyMaths_Overloading {

    /*****************************************
     *      overloaded "add" methods
     ****************************************/
    public void add(int num1, int num2) {
        System.out.println("method called: add(int num1, int num2)");

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    public void add(int num1, int num2, int num3) {
        System.out.println("method called: add(int num1, int num2, int num3)");

        int sum = num1 + num2 + num3;
        System.out.println("Sum: " + sum);
    }

    public void add(double num1, double num2) {
        System.out.println("method called: add(double num1, double num2)");

        double sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    /*****************************************
     *      overloaded "subtract" methods
     ****************************************/
    public void subtract(int num1, int num2) {
        System.out.println("method called: subtract(int num1, int num2)");

        int difference = num1 - num2;
        System.out.println("Subtraction: " + difference);
    }

    public void subtract(double num1, double num2) {
        System.out.println("method called: subtract(double num1, double num2)");

        double difference = num1 - num2;
        System.out.println("Subtraction: " + difference);
    }

    public static void main(String[] args) {
        MyMaths_Overloading myMaths = new MyMaths_Overloading();

        myMaths.add(10, 13);
        myMaths.add(12, 23, 45);
        myMaths.add(2, 4);
        myMaths.add(15.3, 34.5);

        System.out.println(); // print new line

        myMaths.subtract(12, 5);
        myMaths.subtract(20.4, 14);

    }
}
