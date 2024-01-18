package school.java;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import school.java.client.ClientInfo;
import school.java.client.Dul;
import school.java.person.FindPersonInfo;
import school.java.person.IdentityCard;
import school.java.person.PersonInfo;
import school.java.person.PersonName;

import java.io.File;
import java.io.IOException;

public class Adapter {
    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        File xmlFile = new File("src/main/resources/ClientInfo.xml");
        ClientInfo clientInfo = xmlMapper.readValue(xmlFile, ClientInfo.class);

        JsonMapper jsonMapper = new JsonMapper();
        jsonMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        File jsonFile = new File("src/main/resources/PersonInfo.json");
        PersonInfo personInfo = clientToPerson(clientInfo);
        jsonMapper.writeValue(jsonFile, personInfo);
    }

    private static PersonInfo clientToPerson(ClientInfo clientInfo) {
        Dul dul = clientInfo.getClientFindInfo().getDul();

        IdentityCard identityCard = new IdentityCard(dul.getDocumentType(), dul.getSeries(), dul.getNumber());

        PersonName personName = new PersonName(dul.getLastName(), dul.getFirstName(), dul.getSecondName());

        FindPersonInfo findPersonInfo = new FindPersonInfo(
                personName,
                identityCard,
                clientInfo.getClientFindInfo().getPartyId());

        return new PersonInfo(findPersonInfo);
    }
}
