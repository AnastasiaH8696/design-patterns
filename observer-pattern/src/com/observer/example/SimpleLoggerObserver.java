package com.observer.example;

public class SimpleLoggerObserver extends Observer {
    public SimpleLoggerObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Account: " + this.subject.getAccount() + " Sum: " + this.subject.getAmount() + " Action: " + this.subject.getAction());
    }
}
