package com.template.example;

public abstract class Pizza {
    abstract void createDough();
    abstract void createSauce();
    abstract void putSauceOnDough();
    abstract void putCheeseOnDough();
    abstract void putToppings();

    public final void printRecipe() {
        createDough();
        createSauce();
        putSauceOnDough();
        putCheeseOnDough();
        putToppings();
    }
}
