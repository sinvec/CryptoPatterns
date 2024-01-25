package org.example.cryptocurrency;

public class BinanceExchangeRate implements ExchangeRate{
    private Cryptocurrency baseCurrency;
    private Cryptocurrency currencyQuotes;
    private float value;

    public BinanceExchangeRate(
            Cryptocurrency baseCurrency,
            Cryptocurrency currencyQuotes,
            float value) {
        this.baseCurrency = baseCurrency;
        this.currencyQuotes = currencyQuotes;
        this.value = value;
    }

    @Override
    public Boolean updateValue(float value) {
        Boolean isSignificantChange = Math.abs((this.value - value) / this.value) > 0.2f;
        this.value = value;
        System.out.printf(
                "Exchange rate has been changed to %f\n",
                this.value);
        return isSignificantChange;
    }
}
