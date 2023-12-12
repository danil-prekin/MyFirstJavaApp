package Lab3.SR3;

import java.util.Scanner;

public class SR3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите количестсво чисел в последовательности");
        int num = scanner.nextInt();

        int first = 1;
        int second = 1;
        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= num; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}





