package com.prototype.example;

import java.util.HashMap;
import java.util.Map;

public class AnimalStore {
    private static final Map<Integer, Animal> animalMap = new HashMap<>();

    //Data retrieved from DB or any other source
    static
    {
        animalMap.put(1, new Cat(1, Gender.FEMALE, Color.ORANGE, 2));
        animalMap.put(2, new Dog(2, Gender.MALE, Color.BLACK, 3));
    }
    public static Animal getAnimal(int id)
    {
        return animalMap.get(id).clone();
    }
}
