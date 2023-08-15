package com.strategy.example;

public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(Country country1, Country country2){
        return strategy.compare(country1,country2);
    }
}
