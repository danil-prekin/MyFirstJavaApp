package Lab9_SR3;

import java.util.Scanner;

public class SR3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        inputArray(array, 0, scanner);
        System.out.println("Введенный массив:");
        outputArray(array, 0);

        scanner.close();
    }

    public static void inputArray(int[] array, int index, Scanner scanner) {
        if (index < array.length) {
            System.out.print("Введите элемент массива [" + index + "]: ");
            array[index] = scanner.nextInt();
            inputArray(array, index + 1, scanner);
        }
    }

    public static void outputArray(int[] array, int index) {
        if (index < array.length) {
            System.out.println("Элемент массива [" + index + "]: " + array[index]);
            outputArray(array, index + 1);
        }
    }
}
