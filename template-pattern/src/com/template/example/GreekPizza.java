package com.template.example;

public class GreekPizza extends Pizza {
    @Override
    void createDough() {
        System.out.println("White flour dough");
    }

    @Override
    void createSauce() {
        System.out.println("Tomato sauce");
    }

    @Override
    void putSauceOnDough() {
        System.out.println("Put tomato sauce on dough");
    }

    @Override
    void putCheeseOnDough() {
        System.out.println("Mozzarella and Bulgarian cheese");
    }

    @Override
    void putToppings() {
        System.out.println("Black olives on top");
    }
}
