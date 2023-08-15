package com.strategy.example;

public class GDPComparator implements Strategy {
    @Override
    public int compare(Country country1, Country country2) {
        return Double.compare(country1.getGdp(), country2.getGdp());
    }
}
