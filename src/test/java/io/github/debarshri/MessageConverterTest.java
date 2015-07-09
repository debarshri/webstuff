package io.github.debarshri;

import io.github.debarshri.model.Customer;
import io.github.debarshri.model.Product;
import org.fest.assertions.Assertions;
import org.junit.Test;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.ArrayList;

public class MessageConverterTest {

    @Test
    public void shouldConvertClassToMessage() throws JAXBException {
        MessageConverter<Product> productMessageConverter = new MessageConverter<Product>();

        String test = productMessageConverter.convert(new Product("TEst", 10L));

        System.out.println(test);
        Assertions.assertThat(test.contains("<product")).isTrue();
    }

    @Test
    public void shouldConvertCustomer() throws JAXBException {
        MessageConverter<Customer> productMessageConverter = new MessageConverter<Customer>();

        ArrayList<Product> productList = new ArrayList<Product>();

        productList.add(new Product("pro1",10L));
        productList.add(new Product("pro1",10L));
        productList.add(new Product("pro1",10L));

        String tEst = productMessageConverter.convert(new Customer("Cust1", "addr", productList));

        System.out.println(tEst);
        Assertions.assertThat(tEst.contains("name")).isTrue();
    }

    @Test
    public void shouldConvertClassToJSON() throws IOException {
        MessageConverter<Product> productMessageConverter = new MessageConverter<Product>();

        String test = productMessageConverter.convertTOJSON(new Product("TEst", 10L));

        System.out.println(test);
        Assertions.assertThat(test.contains("name")).isTrue();
    }

    @Test
    public void shouldConvertCustomerToJSON() throws IOException {
        MessageConverter<Customer> productMessageConverter = new MessageConverter<Customer>();

        ArrayList<Product> productList = new ArrayList<Product>();

        productList.add(new Product("pro1",10L));
        productList.add(new Product("pro1",10L));
        productList.add(new Product("pro1",10L));

        String tEst = productMessageConverter.convertTOJSON(new Customer("Cust1", "addr", productList));

        System.out.println(tEst);
        Assertions.assertThat(tEst.contains("name")).isTrue();
    }
}