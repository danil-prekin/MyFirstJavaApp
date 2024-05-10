package Lab9_SR7;
import java.util.LinkedList;
import java.util.Iterator;

public class CircleWithLinkedList {
    public static void main(String[] args) {
        int n = 10; // Количество человек в круге
        LinkedList<Integer> circle = new LinkedList<>();

        // Заполняем круг
        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }

        Iterator<Integer> iterator = circle.iterator();
        while (circle.size() > 1) {
            iterator.next();
            iterator.remove();
        }

        System.out.println("Последний человек: " + circle.get(0));
    }
}
