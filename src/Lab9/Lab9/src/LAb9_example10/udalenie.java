package LAb9_example10;
import java.util.*;

public class udalenie {

    public static void main(String[] args) {
        int numElements = 3_000; // Количество элементов для тестирования

        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        // Добавляем элементы в коллекции
        populateCollections(arrayList, linkedHashSet, arrayDeque, numElements);

        System.out.println("Время выполнения операции удаления из середины arrayList = " + getRunningTimeRemoveFromMiddle(arrayList));
        System.out.println("Время выполнения операции удаления из середины linkedHashSet = " + getRunningTimeRemoveFromMiddle(linkedHashSet));
        System.out.println("Время выполнения операции удаления из середины arrayDeque = " + getRunningTimeRemoveFromMiddle(arrayDeque));
    }

    private static void populateCollections(List<Integer> arrayList, Set<Integer> linkedHashSet, Deque<Integer> arrayDeque, int numElements) {
        for (int i = 0; i < numElements; i++) {
            arrayList.add(i);
            linkedHashSet.add(i);
            arrayDeque.addLast(i);
        }
    }

    private static long getRunningTimeRemoveFromMiddle(Collection<Integer> collection) {
        // точка начала отсчета времени выполнения программы
        long start = System.nanoTime();

        // блок кода в котором выполняется операция удаления из середины
        for (int i = 0; i < 3000; i++) {
            if (collection instanceof List) {
                ((List<Integer>) collection).remove(collection.size() / 2);
            } else if (collection instanceof Deque) {
                ((Deque<Integer>) collection).removeFirst();
            } else {
                Iterator<Integer> iterator = collection.iterator();
                if (iterator.hasNext()) {
                    iterator.next();
                    iterator.remove();
                }
            }
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.nanoTime();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }
}
