package Lab9_SR6;
import java.util.HashMap;
import java.util.Map;

public class SR6 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "World");
        map.put(3, "Java");
        map.put(4, "Programming");
        map.put(5, "Language");
        map.put(6, "Development");
        map.put(7, "Framework");
        map.put(8, "Tools");
        map.put(9, "Software");
        map.put(0, "Basic");


        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println("Ключ: " + entry.getKey() + ", строка: " + entry.getValue());
            }
        }


        if (map.containsKey(0)) {
            String result = "";
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getKey() == 0) {
                    result += entry.getValue() + ", ";
                }
            }
            System.out.println("Строки с ключом 0: " + result);
        }


        int product = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
            }
        }
        System.out.println("Продукт ключей строк с длиной > 5: " + product);
    }
}
