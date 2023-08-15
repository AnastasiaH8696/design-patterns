package com.singleton.example;

public class World {
    private static final World instance = new World();
    private World(){}
    public static World getInstance(){
        return instance;
    }
    public void show(){
        System.out.println("Hello World!");
    }
}
