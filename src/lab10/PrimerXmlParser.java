package lab10;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
public class PrimerXmlParser {
    public static void main(String[] args) {
        try {
            File inputFile = new File("Programming_Git/src/lab10/example1.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);

            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("book");
            System.out.println("Test: " + nodeList.getLength());
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println("\nТекущий элемент: " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("Название книги: " +
                            element.getElementsByTagName("title").item(0)
                                    .getTextContent());
                    System.out.println("Автор: " +
                            element.getElementsByTagName("author").item(0)
                                    .getTextContent());
                    System.out.println("Год издания: " +
                            element.getElementsByTagName("year").item(0)
                                    .getTextContent());
                }
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
