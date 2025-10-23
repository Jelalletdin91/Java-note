public class MyMaths_NoReturn {

    public void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    public void subtract(int num1, int num2) {
        int difference = num1 - num2;
        System.out.println("Subtraction: " + difference);
    }

    public static void main(String[] args) {

        MyMaths_NoReturn myMaths = new MyMaths_NoReturn();

        // "add" method calls
        myMaths.add(10, 15);
        myMaths.add(5, 20);
        myMaths.add(50, 70);

        // "subtract" method calls
        myMaths.subtract(20, 10);
        myMaths.subtract(100, 75);
        myMaths.subtract(10, 23);
    }
}
