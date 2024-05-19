package SR5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class SR5 {
    public static int findMax(int[] arr) throws InterruptedException, ExecutionException {
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
                int max = Integer.MIN_VALUE;
                for (int num : chunk) {
                    if (num > max) {
                        max = num;
                    }
                }
                return max;
            };

            futures[i] = executor.submit(task);
        }

        int globalMax = Integer.MIN_VALUE;
        for (Future<Integer> future : futures) {
            int max = future.get();
            if (max > globalMax) {
                globalMax = max;
            }
        }

        executor.shutdown();
        return globalMax;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 15, 20, 3, 25, 12, 18, 7};

        try {
            int max = findMax(arr);
            System.out.println("Максимальный элемент в массиве: " + max);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
