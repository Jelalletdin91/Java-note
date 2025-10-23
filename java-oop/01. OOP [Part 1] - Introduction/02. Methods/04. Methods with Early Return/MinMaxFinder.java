public class MinMaxFinder {

    public void printMaxNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return; // return from the method; end further method execution
        }

        int maxNumber = numbers[0];

        for (int currentNumber : numbers) {
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }

        System.out.println("Max number: " + maxNumber);
    }

    public void printMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return; // return from the method; end further method execution
        }

        int minNumber = numbers[0];

        for (int currentNumber : numbers) {
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
        }

        System.out.println("Min number: " + minNumber);
    }

    public static void main(String[] args) {
        MinMaxFinder minMaxFinder = new MinMaxFinder();

        int[] numbers = { 10, 4, 8, 2, 29, 32, 4, 11 , 9 };

        minMaxFinder.printMaxNumber(numbers);
        minMaxFinder.printMinNumber(numbers);
    }
}
