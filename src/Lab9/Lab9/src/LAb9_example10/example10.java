package LAb9_example10;

import java.util.*;

public class example10 {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Queue<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("Время выполнения операции добавления arrayList = " + getRunningTime(arrayList));
        System.out.println("Время выполнения операции добавления linkedHashSet = " + getRunningTime(linkedHashSet));
        System.out.println("Время выполнения операции добавления arrayDeque = " + getRunningTime(arrayDeque));

    }

    private static long getRunningTime(Collection<Integer> collection) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 1000000; i++) {
            collection.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}

