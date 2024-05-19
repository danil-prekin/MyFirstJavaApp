package SR9;
import java.util.ArrayList;
import java.util.List;

public class SR9 {
    public static List<String> filterLetterOnly(List<String> inputList) {
        List<String> filteredList = new ArrayList<>();

        for (String str : inputList) {
            if (str.matches("[a-zA-Z]+")) {
                filteredList.add(str);
            }
        }

        return filteredList;
    }

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("book11");
        inputList.add("book");
        inputList.add("-book-");

        List<String> filteredList = filterLetterOnly(inputList);

        System.out.println("Исходный список: " + inputList);
        System.out.println("Отфильтрованный список: " + filteredList);
    }

}
