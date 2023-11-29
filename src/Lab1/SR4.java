package Lab1;

import java.util.Scanner;
public class SR4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Название текущего месяца?: ");
        String Month  = in.nextLine();
        System.out.println("Количество дней в этом месяце?: ");
        int data = in.nextInt();
        System.out.print(Month + " " + "содержит " + " " + data + " дней");
        in.close();
    }
}