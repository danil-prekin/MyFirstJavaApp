package Lab1;

import java.util.Scanner;
public class SR3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("текущий день недели: ");
        String weekend = in.nextLine();
        System.out.println("название текущего месяца: ");
        String Month  = in.nextLine();
        System.out.println("текущее число месяца: ");
        int data = in.nextInt();
        System.out.print("Сегодняшняя дата: " + weekend + " " + data + " " + Month);
        in.close();
    }
}
