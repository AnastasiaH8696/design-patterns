package com.state.example;

public class EatActionState implements AnimalState {
    @Override
    public void doAction(AnimalActionContext context) {
        System.out.println("Set state: Animal eat");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Animal eat";
    }
}
