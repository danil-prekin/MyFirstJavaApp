package Lab13.SR3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = Integer.parseInt(scanner.nextLine());
            byte[] array = new byte[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                int num = Integer.parseInt(scanner.nextLine());

                if (num < Byte.MIN_VALUE || num > Byte.MAX_VALUE) {
                    throw new ArithmeticException("Значение выходит за границы диапазона типа byte");
                }

                array[i] = (byte) num;
            }

            int sum = 0;
            for (byte num : array) {
                sum += num;
            }

            System.out.println("Сумма элементов массива: " + sum);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введено некорректное число");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();
    }
}
