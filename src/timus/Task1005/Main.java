package Task1005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] weights = new int[n];
        int totalWeight = 0;

        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
            totalWeight += weights[i];
        }

        int minDiff = findMinDifference(weights, n, totalWeight);
        System.out.println(minDiff);
    }

    private static int findMinDifference(int[] weights, int n, int totalWeight) {
        boolean[][] dp = new boolean[n + 1][totalWeight + 1];
        dp[0][0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= totalWeight; j++) {
                dp[i][j] = dp[i - 1][j] || (j >= weights[i - 1] && dp[i - 1][j - weights[i - 1]]);
            }
        }

        int minDiff = Integer.MAX_VALUE;
        for (int j = totalWeight / 2; j >= 0; j--) {
            if (dp[n][j]) {
                minDiff = totalWeight - 2 * j;
                break;
            }
        }

        return minDiff;
    }
}
