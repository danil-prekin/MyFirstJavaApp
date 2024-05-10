package Lab9_SR7;
import java.util.ArrayList;
import java.util.List;

public class CircleWithArrayList {
    public static void main(String[] args) {
        int n = 10;
        List<Integer> circle = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }

        int index = 0;
        while (circle.size() > 1) {
            index = (index + 1) % circle.size();
            circle.remove(index);
        }

        System.out.println("Последний человек: " + circle.get(0));
    }
}
