package com.proxy.example;

public class Soldier implements ISoldier {
    private final String name;
    private final String idNumber;
    private final String rank;
    private final double height;

    public Soldier(String name, String idNumber, String rank, double height) {
        this.name = name;
        this.idNumber = idNumber;
        this.rank = rank;
        this.height = height;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + idNumber);
        System.out.println("Rank: " + rank);
        System.out.println("Height: " + height + "m");
    }
}
