package io.github.debarshri.model;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Customer {
    private String name;
    private String address;

    @XmlElementWrapper(name = "products")
    private List<Product> product;

    public Customer() {
        //ignore
    }

    public Customer(String name, String address, List<Product> product) {
        this.name = name;
        this.address = address;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getProduct() {
        return product;
    }
}
