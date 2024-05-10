package Lab9_SR2;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число для перевода в двоичную систему: ");
        int number = scanner.nextInt();
        scanner.close();

        String binary = decimalToBinary(number);
        System.out.println("Число " + number + " в двоичной системе: " + binary);
    }

    public static String decimalToBinary(int number) {
        if (number == 0) {
            return "0";
        } else if (number == 1) {
            return "1";
        } else {
            int remainder = number % 2;
            int quotient = number / 2;
            return decimalToBinary(quotient) + String.valueOf(remainder);
        }
    }
}
