package Lab4;
import java.util.Arrays;
import java.util.Random;

public class SR6 {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][n];

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rand.nextInt(100);
            }
        }

        System.out.println("Исходный массив:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int rowIndex = rand.nextInt(n);
        int columnIndex = rand.nextInt(n);

        int[][] newArr = new int[n - 1][n - 1];
        for (int i = 0, k = 0; i < n; i++) {
            if (i == rowIndex) {
                continue;
            }
            for (int j = 0, l = 0; j < n; j++) {
                if (j == columnIndex) {
                    continue;
                }
                newArr[k][l] = arr[i][j];
                l++;
            }
            k++;
        }

        System.out.println("Массив после удаления строки " + rowIndex + " и столбца " + columnIndex + ":");
        for (int i = 0; i < n - 1; i++) {
            System.out.println(Arrays.toString(newArr[i]));
        }
    }
}
