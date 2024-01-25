package org.example;

import org.example.cryptocurrency.Cryptocurrency;
import org.example.cryptocurrency.BinanceExchangeRate;
import org.example.cryptocurrency.ExchangeRate;
import org.example.factory.AltcoinFactory;
import org.example.factory.TokenFactory;
import org.example.observer.ExchangeObserver;
import org.example.trader.Trader;

public class Main {
    public static void main(String[] args) {
        TokenFactory tokenFactory = new TokenFactory();
        Cryptocurrency myToken = tokenFactory.createCryptocurrency();

        AltcoinFactory altcoinFactory = new AltcoinFactory();
        Cryptocurrency myAltcoin = altcoinFactory.createCryptocurrency();

        ExchangeRate myER = new BinanceExchangeRate(myToken, myAltcoin, 315.23f);

        ExchangeObserver exchangeObserver = new ExchangeObserver();
        Trader successfulTrader = new Trader("Successful men");

        exchangeObserver.subscribe(successfulTrader);
        exchangeObserver.updateExchangeRate(myER, 299.45f);

        exchangeObserver.unsubscribe(successfulTrader);
        exchangeObserver.updateExchangeRate(myER, 359.45f);
    }
}