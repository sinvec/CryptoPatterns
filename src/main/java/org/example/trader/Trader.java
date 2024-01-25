package org.example.trader;

public class Trader implements EventListener {
    public String name;
    public Trader(String name) {
        this.name = name;
    }
    @Override
    public void updateValue(float value) {
        System.out.printf(
                "Trader <<%s>> noticed changed exchange rate value %f!\n",
                this.name,
                value);
    }

    @Override
    public void notifyIfSignificant(Boolean isSignificantChange) {
        if (isSignificantChange) {
            System.out.println("IT'S TIME TO WORK!");
        }
    }
}
