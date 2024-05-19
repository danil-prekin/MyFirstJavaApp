package SR8;
import java.util.ArrayList;
import java.util.List;

public class SR8 {
    public static List<Integer> filterGreaterThan(List<Integer> inputList, int threshold) {
        List<Integer> filteredList = new ArrayList<>();

        for (int num : inputList) {
            if (num > threshold) {
                filteredList.add(num);
            }
        }

        return filteredList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
        inputList.add(10);
        inputList.add(15);
        inputList.add(20);
        inputList.add(25);
        inputList.add(30);

        int threshold = 20;

        List<Integer> filteredList = filterGreaterThan(inputList, threshold);

        System.out.println("Исходный список: " + inputList);
        System.out.println("Пороговое значение: " + threshold);
        System.out.println("Отфильтрованный список: " + filteredList);
    }
}
