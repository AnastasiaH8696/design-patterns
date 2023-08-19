package com.template.example;

public class MushroomBlancoPizza extends Pizza {
    @Override
    void createDough() {
        System.out.println("Dough from sourdough flour");
    }

    @Override
    void createSauce() {
        System.out.println("Mushroom cream sauce");
    }

    @Override
    void putSauceOnDough() {
        System.out.println("Put Mushroom sauce on sourdough");
    }

    @Override
    void putCheeseOnDough() {
        System.out.println("Mozzarella and Parmesan cheese");
    }

    @Override
    void putToppings() {
        System.out.println("Mushrooms on top");
    }
}
