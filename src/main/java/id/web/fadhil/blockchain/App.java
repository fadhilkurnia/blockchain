/*  
    Main class of Simple Blockchain

    Simple Blockchain is super simple blockchain that can use
    various hash function to maintain its integrity.

    Copyright (C) 2018, Fadhil Imam Kurnia <fadhilimamk@gmail.com>
    More information about me and my project can be found at
    fadhil.web.id
*/

package id.web.fadhil.blockchain;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello Blockchain!");
        Blockchain blockchain = new Blockchain(HashAlgorithm.KECCAK);

        Data def = new Data("fadhil", "someone", "asdasdhgasd".getBytes());
        Block genesis = new Block("0", def);
        blockchain.addBlock(genesis);
        blockchain.addBlock(new Block(genesis.getHash(), def));
        blockchain.checkIntegrity();

    }

}
