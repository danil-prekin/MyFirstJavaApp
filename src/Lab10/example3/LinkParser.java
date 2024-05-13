package Lab10.example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.FileWriter;

public class LinkParser {
    public static void main(String[] args) {
        String url = "https://itlearn.ru/first-steps";
        int maxRetries = 3;
        int retryCount = 0;

        while (retryCount < maxRetries) {
            try {
                Document doc = Jsoup.connect(url).get();
                Elements links = doc.select("a[href]");

                StringBuilder sb = new StringBuilder();
                for (Element link : links) {
                    String absLink = link.attr("abs:href");
                    sb.append(absLink).append("\n");
                }

                try (FileWriter file = new FileWriter("src/Lab10/example4/save_links.txt")) {
                    file.write(sb.toString());
                    System.out.println("Ссылки сохранены в файл");
                }
                break; // Выход из цикла при успешном получении данных
            } catch (IOException e) {
                System.err.println("Ошибка при получении HTML-кода страницы: " + e.getMessage());
                retryCount++;
                System.out.println("Попытка переподключения (" + retryCount + "/" + maxRetries + ")");
            }
        }

        if (retryCount == maxRetries) {
            System.err.println("Достигнуто максимальное количество попыток.");
        }
    }
}