package id.web.fadhil.blockchain;

public class Block {
    private String hash;
    private String previousHash;
    private Data data;

    public Block(String previousHash, Data data) {
        this.previousHash = previousHash;
        this.data = data;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getHash() {
        return hash;
    }

    @Override
    public String toString() {
        return  "<BLOCK>\n"+
                "previous_hash=" + previousHash + "\n" +
                "data=" + data.toString() + "\n\n";
    }
}
