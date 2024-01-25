package org.example.cryptocurrency;

public class Altcoin implements Cryptocurrency {

    public String blockchainPlatform;
    public String author;

    public Altcoin(String blockchainPlatform) {
        this.blockchainPlatform = blockchainPlatform;
    }

    public Altcoin(String blockchainPlatform, String author) {
        this(blockchainPlatform);
        this.author = author;
    }

    @Override
    public void changeBlockchainPlatform(String blockchainPlatform) {
        this.blockchainPlatform = blockchainPlatform;
    }
}
