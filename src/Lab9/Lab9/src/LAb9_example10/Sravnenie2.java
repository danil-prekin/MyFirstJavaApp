package LAb9_example10;

import java.util.*;

public class Sravnenie2 {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("Время выполнения операции добавления в середину arrayList = " + getRunningTimeAddToMiddle(arrayList));
        System.out.println("Время выполнения операции добавления в середину linkedHashSet = " + getRunningTimeAddToMiddle(linkedHashSet));

    }

    private static long getRunningTimeAddToMiddle(Collection<Integer> collection) {

        // точка начала отсчета времени выполнения программы
        long start = System.nanoTime();

        // блок кода в котором выполняется операция добавления в середину
        for (int i = 0; i < 1000000; i++) {
            if (collection instanceof List) {
                ((List<Integer>) collection).add(collection.size() / 2, i);
            } else {
                collection.add(i);
            }
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.nanoTime();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }
}
