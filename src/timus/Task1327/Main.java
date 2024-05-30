package Task1327;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                c++;
            }
        }

        System.out.println(c);
    }
}
