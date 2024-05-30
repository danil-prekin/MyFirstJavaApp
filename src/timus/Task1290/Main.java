package Task1290;


import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] a = new Integer[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);

        List<Integer> list = Arrays.asList(a);
        Collections.reverse(list);

        list.stream()
                .mapToInt(Integer::intValue)
                .forEach(System.out::println);
    }
}
