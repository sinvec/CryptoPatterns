package org.example.factory;

import org.example.cryptocurrency.Token;
import org.example.cryptocurrency.Cryptocurrency;

public class TokenFactory implements CryptocurrencyFactory {
    @Override
    public Cryptocurrency createCryptocurrency() {
        return new Token("Polygon");
    }
}
