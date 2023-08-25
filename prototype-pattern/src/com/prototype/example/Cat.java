package com.prototype.example;

public class Cat extends Animal {

    public Cat(int id, Gender gender, Color furrColor, int age) {
        super(id, gender, furrColor, age);
    }

    @Override
    public void addAnimal() {
        System.out.println("Cat added!");
    }
}
