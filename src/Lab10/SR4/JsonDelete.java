package Lab10.SR4;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

public class JsonDelete{
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/Lab10/SR2/tasks.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("tasks");
            String title = "поиграть";
            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject task = (JSONObject) iterator.next();
                if (title.equals(task.get("title"))) {
                    iterator.remove();
                }}


            try (FileWriter file = new FileWriter("src/Lab10/SR2/tasks.json")) {
                file.write(jsonObject.toJSONString());
                System.out.println("Задача удалена");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}