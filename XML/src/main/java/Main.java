import org.w3c.dom.Document;

public class Main {
    public static void main(String[] args) {
        /* Aufgabe 1.2 Regeln und Aufbau von XML Dateien
        Aufgabe 1.2.1 XML-Dokumente
        <?xml version="1.0" encoding="UTF-8"?>
        Aufgabe 1.2.2 Tags
        <breakfast_menu>...</breakfast_menu>
        Aufgabe 1.2.3 Tags
        1.2.2 ... => <food>...</food><food>...</food><food>...</food>
        Aufgabe 1.2.4 Attribute
        1.2.3 ... =>  <name>Belgian Waffles</name>
        <price>$5.95</price>
        Aufgabe 1.3.1 Well formed
        Ein JSON HTML
        Beispiel aus W3Schools
            <?xml version="1.0" encoding="UTF-8"?>
            <breakfast_menu>
            <food>
                <name>Belgian Waffles</name>
                <price>$5.95</price>
                <description>
               Two of our famous Belgian Waffles with plenty of real maple syrup
               </description>
                <calories>650</calories>
            </food>
            <food>
                <name>Strawberry Belgian Waffles</name>
                <price>$7.95</price>
                <description>
                Light Belgian waffles covered with strawberries and whipped cream
                </description>
                <calories>900</calories>
            </food>
            <food>
                <name>Berry-Berry Belgian Waffles</name>
                <price>$8.95</price>
                <description>
                Belgian waffles covered with assorted fresh berries and whipped cream
                </description>
                <calories>900</calories>
            </food>
            <food>
                <name>French Toast</name>
                <price>$4.50</price>
                <description>
                Thick slices made from our homemade sourdough bread
                </description>
                <calories>600</calories>
            </food>
            <food>
                <name>Homestyle Breakfast</name>
                <price>$6.95</price>
                <description>
                Two eggs, bacon or sausage, toast, and our ever-popular hash browns
                </description>
                <calories>950</calories>
            </food>
            </breakfast_menu>
            Aufgabe 1.3.2 Valid
            Ein valides Objekt, dass in einer Applikation benutzt werden kann.
            1.4.1 Beispiele:
            Man kann XML in mehreren Projekten benutzen. Einer davon ist der Maven
            Dort hat man eine pom.xml Datei diese past auf alle nötigen Komponenten
            einer Applikation
            // 3.2 Aufgaben
            Die Datei ist in den Resources unter den Namen addressList.xml gespeichert.
            Für weitere Adressen kann man die obigen Adressen kopieren und
            die Daten zwischen den Attribute Elementen ändern.
            Für weitere Attribute muss ein neuer attribut Element erstellt werden.
            Wenn es ein Array erstellen will muss man einen Tag Element einfügen
            und dort Attribute Elemente einfügen.
            // 3.2.4 Aufgabe
             Die Datei ist in den Resources unter den Namen realtime.xml gespeichert
        */

        XMLParser xmlParser = new XMLParser();
        Document document = xmlParser.parser("XML\\src\\main\\resources\\addressList.xml");
        xmlParser.printFirstTwoLevels(document);
        xmlParser.recursiveXMLPrinter(document);
    }
}