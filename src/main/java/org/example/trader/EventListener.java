package org.example.trader;

public interface EventListener {
    void updateValue(float value);

    void notifyIfSignificant(Boolean isSignificantChange);
}
