package Lab10.SR4;


import java.io.File;
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
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class XmlDelete {
    public static void main(String[] args) {
        try{
            File inputFile = new File("src/Lab10/SR2/tasks.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("task");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println("\nТекущий элемент: " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Задача: " + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Дата: " + element.getElementsByTagName("Date").item(0).getTextContent());
                }
            }

            // Поиск задач по имени или дате
            List<Element> filteredTasks = IntStream.range(0, nodeList.getLength())
                    .mapToObj(nodeList::item)
                    .filter(n -> n.getNodeType() == Node.ELEMENT_NODE)
                    .map(n -> (Element) n)
                    .filter(e -> {
                        String title = e.getElementsByTagName("title").item(0).getTextContent();
                        String date = e.getElementsByTagName("Date").item(0).getTextContent();
                        return title.equalsIgnoreCase("поиграть") && date.equals("Завтра");
                    })
                    .collect(Collectors.toList());

            // Удаление найденных задач
            for (Element task : filteredTasks) {
                Node parentNode = task.getParentNode();
                parentNode.removeChild(task);
            }

            // Вывод найденных задач
            System.out.println("\nНайденная задача удалена:");
            filteredTasks.forEach(task -> {
                System.out.println("Задача: " + task.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("Дата: " + task.getElementsByTagName("Date").item(0).getTextContent());
            });

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/Lab10/SR2/tasks.xml"));
            t.transform(source, result);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
