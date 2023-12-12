package Lab3.SR5;
import java.util.Scanner;

public class SR5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int count = scanner.nextInt();


        int sum = 0;
        int i = 1;

        System.out.print("Числа, удовлетворяющие условию: ");
        while (i <= count) {
            if (i % 5 == 2 || i % 3 == 1) {
                sum += i;
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println("Сумма чисел: " + sum);
    }
}
