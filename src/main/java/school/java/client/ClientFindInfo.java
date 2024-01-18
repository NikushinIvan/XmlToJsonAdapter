package school.java.client;

public class ClientFindInfo {
    private Dul dul;
    private int partyId;

    public ClientFindInfo() {
    }

    public ClientFindInfo(Dul dul, int partyId) {
        this.dul = dul;
        this.partyId = partyId;
    }

    public Dul getDul() {
        return dul;
    }

    public int getPartyId() {
        return partyId;
    }
}
