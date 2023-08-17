package com.state.example;

public class SleepActionState implements AnimalState {
    @Override
    public void doAction(AnimalActionContext context) {
        System.out.println("Set state: Animal sleep");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Animal sleep";
    }
}
