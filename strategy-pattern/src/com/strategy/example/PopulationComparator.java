package com.strategy.example;

public class PopulationComparator implements Strategy {
    @Override
    public int compare(Country country1, Country country2) {
        return Double.compare(country1.getPopulation(), country2.getPopulation());
    }
}
