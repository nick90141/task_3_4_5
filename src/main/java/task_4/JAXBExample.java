package task_4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class JAXBExample {
    public static void main(String[] args) {
        City city = new City();
        city.setName("Kiev");
        city.setSize("big");

        List<Street> streets = new ArrayList<>();
        Street street1 = new Street();
        street1.setName("Main Street");
        streets.add(street1);

        List<House> houses = new ArrayList<>();
        House house1 = new House();
        house1.setNumber(1);
        houses.add(house1);

        CityStructure cityStructure = new CityStructure();
        cityStructure.setCity(city);
        cityStructure.setStreets(streets);
        cityStructure.setHouses(houses);

        try {
            JAXBContext context = JAXBContext.newInstance(CityStructure.class);

            Marshaller marshaller = context.createMarshaller();

            marshaller.marshal(cityStructure, new File("D:\\КУРС ПО JAVA\\Java Advanced\\№7. Serialization in Java. Interfaces Serializable and Externalizable - 10-11-12\\task_3_4_5\\jaxb.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

