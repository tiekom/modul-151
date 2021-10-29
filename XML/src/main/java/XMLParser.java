import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XMLParser {
    Document parser(String fileName) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            return builder.parse(fileName);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void printFirstTwoLevels(Document document) {
        NodeList nodeList = document.getElementsByTagName("adresse");
        System.out.println("Print First Two Levels XML Output");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                System.out.println("Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
                System.out.println("Vorname : " + eElement.getElementsByTagName("vorname").item(0).getTextContent() + "\n");
            }
        }
    }

    public void recursiveXMLPrinter(Document document) {
        NodeList nodeList = document.getElementsByTagName("adresse");
        System.out.println("Recursive XML Output");
        crazyRecursiveMethod(nodeList, 0, nodeList.getLength());
    }

    private void crazyRecursiveMethod(NodeList nodeList, int index, int length) {
        Node node = nodeList.item(index);
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element eElement = (Element) node;
            System.out.println("Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
            System.out.println("Vorname : " + eElement.getElementsByTagName("vorname").item(0).getTextContent() + "\n");
        }
        index++;
        if (index < length) {
            crazyRecursiveMethod(nodeList, index, length);
        }
    }
}
