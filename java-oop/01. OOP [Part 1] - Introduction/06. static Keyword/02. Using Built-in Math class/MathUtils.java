public class MathUtils {
    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public static double powerOf(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double randomNumber(int upperLimit) {
        return Math.floor(Math.random() * upperLimit);
    }
}
