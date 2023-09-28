package task_4;

import javax.xml.bind.annotation.XmlElement;

public class House {
    private int number;

    @XmlElement
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
