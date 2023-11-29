package Lab1;

import java.util.Scanner;
public class SR10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c, d;
        System.out.println("Введите число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        c = (a + b);
        d = (a - b);
        System.out.println("Сумма чисел: " + c);
        System.out.println("Разность чисел: " + d);
        in.close();
    }
}
