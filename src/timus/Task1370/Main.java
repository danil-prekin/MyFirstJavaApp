package Task1370;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        short[] a = new short[n];

        for (int i = 0; i < n; i++) {
            a[i] = (short) scanner.nextInt();
        }

        for (int i = k % n, j = 0; j < 10; i++, j++) {
            if (i >= n) {
                i = 0;
            }
            System.out.print(a[i]);
        }
    }
}
