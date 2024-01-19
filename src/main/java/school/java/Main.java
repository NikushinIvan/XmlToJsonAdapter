package school.java;

import school.java.adapter.Adapter;
import school.java.adapter.ClientToPerson;
import school.java.client.services.ClientInfoReader;
import school.java.person.services.PersonInfoWriter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ClientInfoReader reader = new ClientInfoReader();
        PersonInfoWriter writer = new PersonInfoWriter();
        ClientToPerson adapter = new Adapter(reader.readDefaultXmlFile());
        writer.writeDefaultJsonFile(adapter.getPersonInfo());
    }
}
