package SR10;
import java.util.ArrayList;
import java.util.List;

public class SR10 {
    public static List<Integer> filterLessThan(List<Integer> inputList, int threshold) {
        List<Integer> filteredList = new ArrayList<>();

        for (int num : inputList) {
            if (num < threshold) {
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

        List<Integer> filteredList = filterLessThan(inputList, threshold);

        System.out.println("Исходный список: " + inputList);
        System.out.println("Пороговое значение: " + threshold);
        System.out.println("Отфильтрованный список: " + filteredList);
    }
}
