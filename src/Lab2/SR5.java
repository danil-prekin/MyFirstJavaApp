package Lab2;

import java.util.Scanner;

public class SR5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int thousands = (number / 1000);
        System.out.println("Количество тысяч в числе: " + thousands);
        }
    }
