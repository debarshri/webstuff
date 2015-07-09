package io.github.debarshri.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
    private String name;
    private long price;

    public Product(String testnae, long i) {

        this.name = testnae;
        this.price = i;
    }

    public Product()
    {
        //ignore
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
