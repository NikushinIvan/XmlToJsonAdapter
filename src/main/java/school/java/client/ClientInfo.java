package school.java.client;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

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
