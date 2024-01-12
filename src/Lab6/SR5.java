package Lab6;

public class SR5 {
        public static int sumOfSquares(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i * i;
            }
            return sum;
        }
    }
class Main_SR5 {
    public static void main(String[] args) {
        int n = 5;
        int result = SR5.sumOfSquares(n);
        System.out.println("Сумма квадратов натуральных чисел от 1 до " + n + " = " + result);
    }
}