package id.web.fadhil.blockchain;

import java.util.LinkedList;

public class Blockchain {
    private HashAlgorithm hashAlgorithm;
    private LinkedList<Block> chain;

    public Blockchain(HashAlgorithm hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
    }

    public boolean checkIntegrity() {
        return false;
    }

}
