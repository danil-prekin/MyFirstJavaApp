package Lab13.SR1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = Integer.parseInt(scanner.nextLine());
            int[] array = new int[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                array[i] = Integer.parseInt(scanner.nextLine());
            }

            int sum = 0;
            int count = 0;
            for (int num : array) {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }

            if (count == 0) {
                throw new ArithmeticException("Отсутствуют положительные элементы в массиве");
            }

            double average = (double) sum / count;
            System.out.println("Среднее значение среди положительных элементов: " + average);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введите число");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();
    }
}
