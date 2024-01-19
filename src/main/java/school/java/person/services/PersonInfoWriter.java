package school.java.person.services;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import school.java.person.model.PersonInfo;

import java.io.File;
import java.io.IOException;

public class PersonInfoWriter {
    private final String PATH_TO_JSON_FILE = "src/main/resources/PersonInfo.json";
    private  final JsonMapper JSON_MAPPER = new JsonMapper();

    public void writeDefaultJsonFile(PersonInfo personInfo) {
        JSON_MAPPER.enable(SerializationFeature.WRAP_ROOT_VALUE);
        File jsonFile = new File(PATH_TO_JSON_FILE);
        try {
            JSON_MAPPER.writeValue(jsonFile, personInfo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
