package SR6;
import java.util.ArrayList;
import java.util.List;

public class SR6 {
    public static List<Integer> filterDivisible(List<Integer> inputList, int divisor) {
        List<Integer> filteredList = new ArrayList<>();

        for (int num : inputList) {
            if (num % divisor == 0) {
                filteredList.add(num);
            }
        }

        return filteredList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
        inputList.add(10);
        inputList.add(15);
        inputList.add(17);
        inputList.add(25);
        inputList.add(30);

        int divisor = 5;

        List<Integer> filteredList = filterDivisible(inputList, divisor);

        System.out.println("Исходный список: " + inputList);
        System.out.println("Делитель: " + divisor);
        System.out.println("Отфильтрованный список: " + filteredList);
    }

}
