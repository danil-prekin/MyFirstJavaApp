package SR6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class SR6 {
    public static int sumArray(int[] arr) throws InterruptedException, ExecutionException {
        int numThreads = 4;
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        Future<Integer>[] futures = new Future[numThreads];
        int chunkSize = arr.length / numThreads;

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? arr.length : (i + 1) * chunkSize;
            int[] chunk = new int[end - start];
            System.arraycopy(arr, start, chunk, 0, end - start);

            final int finalI = i;
            Callable<Integer> task = () -> {
                int sum = 0;
                for (int num : chunk) {
                    sum += num;
                }
                return sum;
            };

            futures[i] = executor.submit(task);
        }

        int totalSum = 0;
        for (Future<Integer> future : futures) {
            totalSum += future.get();
        }

        executor.shutdown();
        return totalSum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 15, 20, 3, 25, 12, 18, 7};

        try {
            int sum = sumArray(arr);
            System.out.println("Сумма элементов в массиве: " + sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
