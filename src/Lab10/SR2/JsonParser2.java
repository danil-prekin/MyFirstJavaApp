package Lab10.SR2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.stream.StreamSupport;

public class JsonParser2 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/Lab10/SR2/tasks.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("tasks");

            for (Object o : jsonArray) {
                JSONObject task = (JSONObject) o;
                System.out.println("\nТекущий элемент: task");
                System.out.println("Задача: " + task.get("title"));
                System.out.println("Дата: " + task.get("Date"));
            }

            String dateToFind = "Завтра";
            StreamSupport.stream(jsonArray.spliterator(), false)
                    .filter(task -> task instanceof JSONObject)
                    .map(task -> (JSONObject) task)
                    .filter(task -> dateToFind.equals(((JSONObject) task).get("Date")))
                    .forEach(task -> {
                        System.out.println("\nНайденные задачи: task");
                        System.out.println("Задача: " + ((JSONObject) task).get("title"));
                        System.out.println("Дата: " + ((JSONObject) task).get("Date"));
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}