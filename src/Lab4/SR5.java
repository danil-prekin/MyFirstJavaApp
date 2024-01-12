package Lab4;
import java.util.Arrays;
import java.util.Random;

public class SR5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int[][] arr = new int[a][b];

        Random rand = new Random();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = rand.nextInt(100);
            }
        }

        System.out.println("Исходный массив:");
        for (int i = 0; i < a; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int[][] transposedArr = new int[b][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                transposedArr[j][i] = arr[i][j];
            }
        }
        System.out.println("Массив после замены строк и столбцов:");
        for (int i = 0; i < b; i++) {
            System.out.println(Arrays.toString(transposedArr[i]));
        }
    }
}
