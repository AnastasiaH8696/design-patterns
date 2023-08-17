package com.state.example;

public class AnimalActionContext {
    private AnimalState state;

    public AnimalActionContext() {
        this.state = null;
    }

    public AnimalState getState() {
        return state;
    }

    public void setState(AnimalState state) {
        this.state = state;
    }
}

