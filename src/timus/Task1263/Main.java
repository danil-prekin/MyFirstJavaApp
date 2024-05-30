package Task1263;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[10000];

        for (int i = 0; i < m; i++) {
            int p = scanner.nextInt();
            a[p - 1]++;
        }

        for (int i = 0; i < n; i++) {
            double res = (double) a[i] * 100 / m;
            System.out.printf("%.2f%% \n", res);
        }
    }
}
