package id.web.fadhil.blockchain;

public class Data {
    private String sender;
    private String receiver;
    private byte[] payload;

    public Data(String sender, String receiver, byte[] payload) {
        this.sender = sender;
        this.receiver = receiver;
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "sender=" + sender + ";receiver=" + receiver + ";payload=" + String.valueOf(payload);
    }

}
