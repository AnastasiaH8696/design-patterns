package com.factory.example;

public class KamikazaDrone implements Drone {
    @Override
    public void createDrone() {
        System.out.println("KamikazaDrone created!");
    }
}
