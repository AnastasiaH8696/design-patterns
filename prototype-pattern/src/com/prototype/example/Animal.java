package com.prototype.example;

public abstract class Animal implements Cloneable {
    private int id;
    private Gender gender;
    private Color furrColor;
    private int age;

    public Animal(int id, Gender gender, Color furrColor, int age) {
        this.id = id;
        this.gender = gender;
        this.furrColor = furrColor;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Color getFurrColor() {
        return furrColor;
    }

    public void setFurrColor(Color furrColor) {
        this.furrColor = furrColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void addAnimal();
    @Override
    public Animal clone() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
