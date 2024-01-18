package school.java.person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonName {
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("MiddleName")
    private String middleName;

    public PersonName() {
    }

    public PersonName(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }
}
