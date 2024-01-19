package school.java.person.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import school.java.person.model.FindPersonInfo;

public class PersonInfo {
    @JsonProperty("FindPersonInfo")
    private FindPersonInfo findPersonInfo;

    public PersonInfo() {
    }

    public PersonInfo(FindPersonInfo findPersonInfo) {
        this.findPersonInfo = findPersonInfo;
    }

    public FindPersonInfo getFindPersonInfo() {
        return findPersonInfo;
    }
}
