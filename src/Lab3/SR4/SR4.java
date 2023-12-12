package Lab3.SR4;

import java.util.Scanner;
public class SR4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два целых числа: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        System.out.println("Числа между " + first + " и " + second + ":");
        for (int i = first; i <= second; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
