package Lab3.SR5;
import java.util.Scanner;

public class SR5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int count = scanner.nextInt();


        int sum = 0;
        System.out.print("Числа, удовлетворяющие условию: ");
        for (int i = 1; i <= count; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("Сумма чисел: " + sum);
    }
}
