package com.strategy.example;

public class Country {
    private final String name;
    private final double population;
    private final double area;
    private final double gdp;

    public Country(String name, double population, double area, double gdp) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.gdp = gdp;
    }

    public double getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    public double getGdp() {
        return gdp;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", gdp=" + gdp +
                '}';
    }
}
