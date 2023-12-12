package Lab3.SR4;
import java.util.Scanner;
public class SR4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два целых числа: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        System.out.println("Числа между " + first + " и " + second + ":");
        int i = first;
        while (i <= second) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}
