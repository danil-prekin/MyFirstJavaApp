package SR2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите количество строк в матрице: ");
            int rows = Integer.parseInt(scanner.nextLine());

            System.out.print("Введите количество столбцов в матрице: ");
            int cols = Integer.parseInt(scanner.nextLine());

            int[][] matrix = new int[rows][cols];

            System.out.println("Введите элементы матрицы:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Элемент [" + i + "][" + j + "]: ");
                    matrix[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }

            System.out.print("Введите номер столбца для вывода: ");
            int columnNumber = Integer.parseInt(scanner.nextLine());

            if (columnNumber < 1 || columnNumber > cols) {
                throw new ArrayIndexOutOfBoundsException("Нет столбца с таким номером");
            }

            System.out.println("Столбец " + columnNumber + ":");
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][columnNumber - 1]);
            }

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введено некорректное число");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();
    }
}
