package ru.prekin.MyFirstTestAppSpringBoot.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    private List<String> stringList;
    private HashMap<Integer, String> stringMap;
    private int currentId = 0;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        logger.info("Получен запрос с именем: {}", name);
        return String.format("Hello %s!", name);
    }

    @GetMapping("/update-array")
    public String updateArrayList(@RequestParam(value = "value") String value) {
        if (stringList == null) {
            stringList = new ArrayList<>();
            logger.info("Создан новый пустой ArrayList");
        }

        // Добавление значения в список
        stringList.add(value);
        logger.info("Добавлено значение: {}", value);

        return String.format("Значение '%s' добавлено в список. Текущий список: %s", value, stringList);
    }

    @GetMapping("/show-array")
    public List<String> showArrayList() {
        if (stringList == null || stringList.isEmpty()) {
            logger.info("Список пуст.");
            return List.of();
        }

        logger.info("Текущий список: {}", stringList);
        return stringList;
    }

    @GetMapping("/update-map")
    public String updateHashMap(@RequestParam(value = "value") String value) {
        if (stringMap == null) {
            stringMap = new HashMap<>();
            logger.info("Создан новый пустой HashMap");
        }

        stringMap.put(currentId++, value);
        logger.info("Добавлено значение: {} с ключом: {}", value, currentId - 1);

        return String.format("Значение '%s' добавлено в HashMap с ключом %d.", value, currentId - 1);
    }

    @GetMapping("/show-map")
    public HashMap<Integer, String> showHashMap() {
        if (stringMap == null || stringMap.isEmpty()) {
            logger.info("HashMap пуст.");
            return new HashMap<>();
        }

        logger.info("Текущий HashMap: {}", stringMap);
        return stringMap; // Возвращаем текущий HashMap
    }

    @GetMapping("/show-all-length")
    public String showAllLength() {
        int arrayListSize = (stringList != null) ? stringList.size() : 0;
        int hashMapSize = (stringMap != null) ? stringMap.size() : 0;

        String result = String.format("Количество элементов в ArrayList: %d, количество элементов в HashMap: %d", arrayListSize, hashMapSize);

        logger.info(result);
        return result; // Возвращаем информацию о количестве элементов
    }
}


