package task_4;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class CityStructure {
    private City city;
    private List<Street> streets;
    private List<House> houses;

    @XmlElement
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @XmlElement
    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }

    @XmlElement
    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }
}
