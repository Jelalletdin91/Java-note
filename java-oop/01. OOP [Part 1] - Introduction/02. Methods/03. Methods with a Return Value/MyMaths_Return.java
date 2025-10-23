public class MyMaths_Return {

    public int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public int subtract(int num1, int num2) {
        int difference = num1 - num2;
        return difference;
    }

    public static void main(String[] args) {

        MyMaths_Return myMaths = new MyMaths_Return();

        // "add" method calls
        System.out.println("Sum of 10 and 15: " + myMaths.add(10, 15));
        System.out.println("Sum of 5 and 20: " + myMaths.add(5, 20));
        System.out.println("Sum of 50 and 70: " + myMaths.add(50, 70));

        // "subtract" method calls
        System.out.println("Subtraction of 10 from 20: " + myMaths.subtract(20, 10));
        System.out.println("Subtraction of 75 from 100: " + myMaths.subtract(100, 75));
        System.out.println("Subtraction of 23 from 10: " + myMaths.subtract(10, 23));
    }
}
