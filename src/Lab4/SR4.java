package Lab4;

public class SR4 {
    public static void main(String[] args) {
    int n = 5;
    char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            arr[i][j] = '+';
        }
    }
        for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }
}
}
