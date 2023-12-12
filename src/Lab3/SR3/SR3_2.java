package Lab3.SR3;
import java.util.Scanner;

public class SR3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности: ");
        int count = scanner.nextInt();

        int first = 1;
        int second = 1;
        System.out.print(first + " " + second + " ");

        int i = 3;
        while (i <= count) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
            i++;
        }
    }
}

