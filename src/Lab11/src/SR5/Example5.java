package SR5;
import java.util.ArrayList;
import java.util.List;

public class Example5 {
    public static List<String> filterStrings(List<String> inputList, String substring) {
        List<String> filteredList = new ArrayList<>();

        for (String str : inputList) {
            if (str.contains(substring)) {
                filteredList.add(str);
            }
        }

        return filteredList;
    }

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("стол");
        inputList.add("стул");
        inputList.add("книга");

        String substring = "ст";

        List<String> filteredList = filterStrings(inputList, substring);

        System.out.println("Исходный список: " + inputList);
        System.out.println("Подстрока для фильтрации: " + substring);
        System.out.println("Отфильтрованный список: " + filteredList);
    }
}


