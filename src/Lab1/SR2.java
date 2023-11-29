package Lab1;

import java.util.Scanner;
public class SR2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Имя: ");
        String name = in.nextLine();
        System.out.println("Введите возраст: ");
        int age = in.nextInt();
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        in.close();
    }
}
