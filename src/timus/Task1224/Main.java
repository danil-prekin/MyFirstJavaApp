package Task1224;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();

        if (m >= n) {
            System.out.println((n - 1) * 2);
        } else {
            System.out.println((m - 1) * 2 + 1);
        }
    }
}