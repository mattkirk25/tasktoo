package tasktoo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "records")
public class Records {

    private List<Record> records;

    public List<Record> getRecords() {
        return records;
    }

    @XmlElement(name = "record")
    public void setRecords(List<Record> records) {
        this.records = records;
    }
}
