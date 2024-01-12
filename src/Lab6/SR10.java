package Lab6;

public class SR10 {
    public static int[] findMinMax(int... numbers) {
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return new int[]{min, max};
    }
}
class Main_SR10 {
    public static void main(String[] args) {
        int[] result = SR10.findMinMax(1, 2, 3, 4, 5);
        System.out.println("Минимальное значение: " + result[0]);
        System.out.println("Максимальное значение: " + result[1]);
    }
}
