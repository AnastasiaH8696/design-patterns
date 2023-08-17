package com.state.example;

public class PlayActionState implements AnimalState {
    @Override
    public void doAction(AnimalActionContext context) {
        System.out.println("Set state: Animal play");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Animal play";
    }
}
