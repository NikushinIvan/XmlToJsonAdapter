package school.java.client.model;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import school.java.client.model.ClientFindInfo;

@JacksonXmlRootElement(localName = "clientInfo")
public class ClientInfo {
    private ClientFindInfo clientFindInfo;

    public ClientInfo() {
    }

    public ClientInfo(ClientFindInfo clientFindInfo) {
        this.clientFindInfo = clientFindInfo;
    }

    public ClientFindInfo getClientFindInfo() {
        return clientFindInfo;
    }
}
