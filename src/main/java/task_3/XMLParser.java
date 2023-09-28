package task_3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class XMLParser {

    public static void main(String[] args) {
        try {
            File inputFile = new File("D:\\КУРС ПО JAVA\\Java Advanced\\№7. Serialization in Java. Interfaces Serializable and Externalizable - 10-11-12\\task_3_4_5\\input.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            CustomHandler handler = new CustomHandler();
            saxParser.parse(inputFile, handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class CustomHandler extends DefaultHandler {
    private boolean isInCity = false;
    private boolean isInStreet = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("city")) {
            String size = attributes.getValue("size");
            System.out.println("City Size: " + size);
            isInCity = true;
        } else if (qName.equalsIgnoreCase("street")) {
            isInStreet = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (isInStreet) {
            String streetName = new String(ch, start, length);
            System.out.println("Street Name: " + streetName);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("city")) {
            System.out.println("End of City");
            isInCity = false;
        } else if (qName.equalsIgnoreCase("street")) {
            isInStreet = false;
        }
    }
}
