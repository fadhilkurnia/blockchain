package id.web.fadhil.blockchain;

public class Block {
    private String hash;
    private String previousHash;
    private Data data;

    public Block(String previousHash, Data data) {
        this.previousHash = previousHash;
        this.data = data;
    }

    public String generateHash() {
        hash = "asdasdasdasdasdasdas";
        return hash;
    }

}
