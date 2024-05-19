package SR7;
import java.util.ArrayList;
import java.util.List;

public class SR7 {
    public static List<String> filterByLength(List<String> inputList, int minLength) {
        List<String> filteredList = new ArrayList<>();

        for (String str : inputList) {
            if (str.length() > minLength) {
                filteredList.add(str);
            }
        }

        return filteredList;
    }

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("стол");
        inputList.add("стул");
        inputList.add("дерево");

        int minLength = 5;

        List<String> filteredList = filterByLength(inputList, minLength);

        System.out.println("Исходный список: " + inputList);
        System.out.println("Минимальная длина: " + minLength);
        System.out.println("Отфильтрованный список: " + filteredList);
    }
}
