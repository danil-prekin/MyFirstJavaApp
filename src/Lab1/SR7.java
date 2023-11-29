package Lab1;

import java.util.Scanner;
public class SR7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        int birthday = in.nextInt();
        System.out.println("Год вашего рождения: " + (2023 - birthday));
        in.close();
    }
}

