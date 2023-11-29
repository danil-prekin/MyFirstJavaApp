package Lab1;

import java.util.Scanner;
public class SR1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фамилию: ");
        String Second_name = in.nextLine();
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите отчество: ");
        String name3 = in.nextLine();
        System.out.print("Hello, " + Second_name + " " + name + " " + name3);
        in.close();
    }
}
