package com.observer.example;

public class BankObserver extends Observer {
    public BankObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Account: " + this.subject.getAccount() + " Sum: " + this.subject.getAmount() +
                " Action: " + this.subject.getAction() + " Fee: " + this.subject.getAmount() * 0.1);
    }
}
