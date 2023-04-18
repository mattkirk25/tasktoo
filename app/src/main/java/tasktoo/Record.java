package tasktoo;

import javax.xml.bind.annotation.XmlElement;

public class Record {

    private String name;
    private String postalZip;
    private String region;
    private String country;
    private String address;
    private String list;

    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getPostalZip() {
        return postalZip;
    }

    @XmlElement(name = "postalZip")
    public void setPostalZip(String postalZip) {
        this.postalZip = postalZip;
    }

    public String getRegion() {
        return region;
    }

    @XmlElement(name = "region")
    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    @XmlElement(name = "country")
    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    @XmlElement(name = "address")
    public void setAddress(String address) {
        this.address = address;
    }

    public String getList() {
        return list;
    }

    @XmlElement(name = "list")
    public void setList(String list) {
        this.list = list;
    }
}
