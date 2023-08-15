package com.strategy.example;

public class AreaComperator implements Strategy {
    @Override
    public int compare(Country country1, Country country2) {
        return Double.compare(country1.getArea(), country2.getArea());
    }
}
