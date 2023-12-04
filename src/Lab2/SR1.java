package Lab2;
import java.util.Scanner;
public class SR1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = in.nextInt();
        if (number % 3 == 0) {
            System.out.println("Число " + number + " делится на 3 без остатка.");
        } else {
            System.out.println("Число " + number + " не делится на 3 без остатка.");
        }
    }
}