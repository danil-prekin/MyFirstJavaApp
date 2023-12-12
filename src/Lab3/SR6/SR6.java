package Lab3.SR6;
import java.util.Scanner;

public class SR6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;

        while (true) {
            try {
                System.out.print("Введите размер массива: ");
                size = Integer.parseInt(scanner.nextLine());
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Размер массива должен быть положительным числом.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите корректное значение для размера массива.");
            }
        }

        int[] arr = new int[size];
        int value = 2;
        for (int i = 0; i < size; i++) {
            arr[i] = value;
            value += 5;
        }
        System.out.print("Массив, удовлетворяющий условию: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
