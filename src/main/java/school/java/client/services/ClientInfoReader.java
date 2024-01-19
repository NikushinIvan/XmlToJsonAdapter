package school.java.client.services;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import school.java.client.model.ClientInfo;

import java.io.File;
import java.io.IOException;

public class ClientInfoReader {
    private final String PATH_TO_XML_FILE = "src/main/resources/ClientInfo.xml";
    private final XmlMapper XML_MAPPER = new XmlMapper();

    public ClientInfo readDefaultXmlFile() {
        File xmlFile = new File(PATH_TO_XML_FILE);
        try {
            return XML_MAPPER.readValue(xmlFile, ClientInfo.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
