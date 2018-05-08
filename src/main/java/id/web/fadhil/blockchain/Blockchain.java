package id.web.fadhil.blockchain;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;

public class Blockchain {

    private HashAlgorithm hashAlgorithm;
    private LinkedList<Block> chain;

    public Blockchain(HashAlgorithm hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        chain = new LinkedList<Block>();
    }

    public void addBlock(Block block) {
        block.setHash(HashUtils.doHash(hashAlgorithm, block.toString()));
        chain.add(block);
    }

    public Block getLastBlock() {
        return chain.getLast();
    }

    public boolean checkIntegrity() {
        boolean checked = false;
        Iterator i = chain.iterator();
        while (i.hasNext()) {
            String raw = i.next().toString();
            System.out.println(raw);
        }
        return checked;
    }


}
