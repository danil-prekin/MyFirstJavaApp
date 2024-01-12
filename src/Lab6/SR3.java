package Lab6;

public class SR3 {
    public static int findMax(int... numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int findMin(int... numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static double findAverage(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
}
class Main_SR3 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int max = SR3.findMax(numbers);
        int min = SR3.findMin(numbers);
        double average = SR3.findAverage(numbers);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }
}