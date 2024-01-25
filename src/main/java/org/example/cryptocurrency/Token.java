package org.example.cryptocurrency;

public class Token implements Cryptocurrency {

    public String blockchainPlatform;

    public Token(String blockchainPlatform) {
        this.blockchainPlatform = blockchainPlatform;
    }

    @Override
    public void changeBlockchainPlatform(String blockchainPlatform) {
        this.blockchainPlatform = blockchainPlatform;
    }

}
