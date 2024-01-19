package school.java.adapter;

import school.java.client.model.ClientInfo;
import school.java.client.model.Dul;
import school.java.person.model.FindPersonInfo;
import school.java.person.model.IdentityCard;
import school.java.person.model.PersonInfo;
import school.java.person.model.PersonName;

public class Adapter implements ClientToPerson {

    private ClientInfo clientInfo;

    public Adapter(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }

    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }

    @Override
    public PersonInfo getPersonInfo() {
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
