package com.factory.example;

public class DronesFactory {
    public Drone getDrone(DroneType type) {
        switch(type) {
            case SIMPLE -> {
                return new SimplePlasticDrone();
            }
            case MISSILIES -> {
                return new DroneWithMissiles();
            }
            case KAMIKAZA -> {
                return new KamikazaDrone();
            }
            default -> {
                return  null;
            }
        }
    }
}
