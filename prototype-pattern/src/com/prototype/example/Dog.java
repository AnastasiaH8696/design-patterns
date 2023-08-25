package com.prototype.example;

public class Dog extends Animal {
    public Dog(int id, Gender gender, Color furrColor, int age) {
        super(id, gender, furrColor, age);
    }

    @Override
    public void addAnimal() {
        System.out.println("Dog added!");
    }
}
