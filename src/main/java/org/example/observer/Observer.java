package org.example.observer;

import org.example.cryptocurrency.ExchangeRate;
import org.example.trader.Trader;

public interface Observer {

    public void updateExchangeRate(ExchangeRate exchangeRate, float value);

    public void subscribe(Trader trader);

    public void unsubscribe(Trader trader);

    public void notify(float value, Boolean isSignificantChange);
}
