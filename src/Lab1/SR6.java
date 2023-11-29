package Lab1;

import java.util.Scanner;
public class SR6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name  = in.nextLine();
        System.out.println("Введите год рождения: ");
        int birthday = in.nextInt();
        System.out.println("Ваше имя и возраст: " +  " " +  name + " " + (2023 - birthday));
        in.close();
    }
}
