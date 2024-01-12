package Lab4;

public class SR3 {
    public static void main(String[] args) {
        int a = 4;
        int b = 20;
        int[][] arr = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = 2;
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
