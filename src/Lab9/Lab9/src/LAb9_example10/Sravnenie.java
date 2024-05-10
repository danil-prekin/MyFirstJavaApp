package LAb9_example10;

import java.util.*;

public class Sravnenie {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("Время выполнения операции добавления в начало arrayList = " + getRunningTimeAddToBeginning(arrayList));
        System.out.println("Время выполнения операции добавления в начало linkedHashSet = " + getRunningTimeAddToBeginning(linkedHashSet));
        System.out.println("Время выполнения операции добавления в начало arrayDeque = " + getRunningTimeAddToBeginning(arrayDeque));

    }

    private static long getRunningTimeAddToBeginning(Collection<Integer> collection) {

        // точка начала отсчета времени выполнения программы
        long start = System.nanoTime();

        // блок кода в котором выполняется операция добавления в начало
        for (int i = 0; i < 1000000; i++) {
            if (collection instanceof List) {
                ((List<Integer>) collection).add(0, i);
            } else if (collection instanceof Deque) {
                ((Deque<Integer>) collection).addFirst(i);
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
