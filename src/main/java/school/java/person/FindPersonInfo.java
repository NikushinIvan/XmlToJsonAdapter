package school.java.person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FindPersonInfo {
    @JsonProperty("PersonName")
    private PersonName personName;
    @JsonProperty("IdentityCard")
    private IdentityCard identityCard;
    @JsonProperty("PartyID")
    private int partyID;

    public FindPersonInfo() {
    }

    public FindPersonInfo(PersonName personName, IdentityCard identityCard, int partyID) {
        this.personName = personName;
        this.identityCard = identityCard;
        this.partyID = partyID;
    }

    public PersonName getPersonName() {
        return personName;
    }

    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    public int getPartyID() {
        return partyID;
    }
}
