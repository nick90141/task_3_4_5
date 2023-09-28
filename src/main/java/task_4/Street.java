package task_4;

import javax.xml.bind.annotation.XmlElement;

public class Street {
    private String name;

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}