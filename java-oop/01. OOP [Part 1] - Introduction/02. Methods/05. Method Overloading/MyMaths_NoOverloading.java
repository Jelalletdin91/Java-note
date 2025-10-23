public class MyMaths_NoOverloading {

    public void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    public void subtract(int num1, int num2) {
        int difference = num1 - num2;
        System.out.println("Subtraction: " + difference);
    }

    public static void main(String[] args) {
        MyMaths_NoOverloading myMathsNoOverloading=new MyMaths_NoOverloading();
        myMathsNoOverloading.add(15, 48);
        myMathsNoOverloading.subtract(98,55);
    }
}
