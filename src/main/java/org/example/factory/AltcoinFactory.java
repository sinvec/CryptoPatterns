package org.example.factory;

import org.example.cryptocurrency.Altcoin;
import org.example.cryptocurrency.Cryptocurrency;

public class AltcoinFactory implements CryptocurrencyFactory {
    @Override
    public Cryptocurrency createCryptocurrency() {
        return new Altcoin("Ethereum");
    }
}
