package Lab10.SR2;
import java.io.File;
import java.util.Scanner;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class XmlParser2 {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/Lab10/SR2/tasks.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());

            // Добавление новой задачи и даты
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите название задачи: ");
            String title = scanner.nextLine();
            System.out.print("Введите дату задачи: ");
            String date = scanner.nextLine();

            Element newTask = doc.createElement("task");
            Element titleElement = doc.createElement("title");
            titleElement.appendChild(doc.createTextNode(title));
            Element dateElement = doc.createElement("Date");
            dateElement.appendChild(doc.createTextNode(date));

            newTask.appendChild(titleElement);
            newTask.appendChild(dateElement);

            doc.getDocumentElement().appendChild(newTask);

            // Сохранение обновленного XML-файла
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/Lab10/SR2/tasks.xml"));
            t.transform(source, result);

            System.out.println("Новая задача добавлена в XML-файл.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
