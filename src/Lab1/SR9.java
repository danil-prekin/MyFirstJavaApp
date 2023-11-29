package Lab1;

import java.util.Scanner;
public class SR9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b, c, d, g;
        System.out.println("Введите число: ");
        int a = in.nextInt();
        b = (a-1);
        c = (a+1);
        d = (a+b+c);
        g = (d * d);
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
        System.out.println(g);
        in.close();
    }
}