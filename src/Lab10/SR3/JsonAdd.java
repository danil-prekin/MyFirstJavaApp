package Lab10.SR3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.stream.StreamSupport;

    public class JsonAdd {
        public static void main(String[] args) {
            try {
                JSONParser parser = new JSONParser();
                Object obj = parser.parse(new FileReader("src/Lab10/SR2/tasks.json"));
                JSONObject jsonObject = (JSONObject) obj;
                System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
                JSONArray jsonArray = (JSONArray) jsonObject.get("tasks");
                JSONObject newTask = new JSONObject();
                newTask.put("title", "поиграть");
                newTask.put("Date", "завтра");
                jsonArray.add(newTask);

                try (FileWriter file = new FileWriter("src/Lab10/SR2/tasks.json")) {
                    file.write(jsonObject.toJSONString());
                    System.out.println("Задача добавлена");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
