package Lab1;

import java.util.Scanner;
public class SR5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год рождения: ");
        int birthday = in.nextInt();
        System.out.println("Ваш возраст: " + (2023 - birthday));
        in.close();
    }
}
