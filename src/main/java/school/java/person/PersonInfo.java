package school.java.person;

import com.fasterxml.jackson.annotation.JsonProperty;

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
