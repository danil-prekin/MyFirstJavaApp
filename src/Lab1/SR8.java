package Lab1;

import java.util.Scanner;
public class SR8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Калькулятор для сложения");
        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();
        System.out.println("Сумма " + (a + b));
        in.close();
    }
}
