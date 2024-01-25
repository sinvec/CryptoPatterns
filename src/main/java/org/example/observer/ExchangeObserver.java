package org.example.observer;

import org.example.cryptocurrency.ExchangeRate;
import org.example.trader.Trader;

import java.util.ArrayList;
import java.util.List;

public class ExchangeObserver implements Observer {

    private List<Trader> traders;

    public ExchangeObserver() {
        this.traders = new ArrayList<>();
    }

    @Override
    public void updateExchangeRate(ExchangeRate exchangeRate, float value) {
        Boolean isSignificantChange = exchangeRate.updateValue(value);
        notify(value, isSignificantChange);
    }

    @Override
    public void subscribe(Trader trader) {
        traders.add(trader);
    }

    @Override
    public void unsubscribe(Trader trader) {
        traders.remove(trader);
    }

    @Override
    public void notify(float value, Boolean isSignificantChange) {
        for(Trader trader: traders) {
            trader.updateValue(value);
            trader.notifyIfSignificant(isSignificantChange);
        }
    }

}
