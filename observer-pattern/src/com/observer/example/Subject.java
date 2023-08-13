package com.observer.example;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private final List<Observer> observers = new ArrayList<>();
    private double amount;
    private String action;

    private int account;

    public List<Observer> getObservers() {
        return observers;
    }

    public double getAmount() {
        return amount;
    }

    public String getAction() {
        return action;
    }

    public int getAccount() {
        return account;
    }

    public void setState(double amount, String action, int account){
        this.amount = amount;
        this.action = action;
        this.account = account;
        notifyAllObservers();
    }
    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}