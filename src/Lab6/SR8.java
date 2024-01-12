package Lab6;

public class SR8 {
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }
}
class Main_SR8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double average = SR8.calculateAverage(array);
        System.out.println("Среднее значение: " + average);
    }
}