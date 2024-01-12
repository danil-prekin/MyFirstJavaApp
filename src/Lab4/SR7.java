package Lab4;

public class SR7 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] arr = new int[rows][cols];
        int count = 1;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = count;
                    count++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    arr[i][j] = count;
                    count++;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
