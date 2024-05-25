package Task1203;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] talks = new int[n][2];

        for (int i = 0; i < n; i++) {
            talks[i][0] = scanner.nextInt(); // время начала
            talks[i][1] = scanner.nextInt(); // время окончания
        }

        Arrays.sort(talks, (a, b) -> a[1] - b[1]); // сортировка по времени окончания

        int count = 1;
        int end = talks[0][1];

        for (int i = 1; i < n; i++) {
            if (talks[i][0] > end) {
                count++;
                end = talks[i][1];
            }
        }

        System.out.println(count);
    }
}
