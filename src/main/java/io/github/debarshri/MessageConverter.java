package io.github.debarshri;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class MessageConverter<T> {

    public String convert(T message) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(message.getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        marshaller.marshal(message,byteArrayOutputStream );

        return byteArrayOutputStream.toString();
    }

    public String convertTOJSON(T message) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        objectMapper.writeValue(byteArrayOutputStream, message);

        return byteArrayOutputStream.toString();
    }
}
