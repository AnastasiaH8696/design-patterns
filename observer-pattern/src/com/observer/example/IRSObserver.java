package com.observer.example;

public class IRSObserver extends Observer {
    public IRSObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        if(this.subject.getAction().equals("deposit") && this.subject.getAmount() > 100000 ) {
            System.out.println("Account: " + this.subject.getAccount() +
                    " a suspected operation was carried whenever a deposit of more than 100000 shekels was completed. Amount: " +
                    this.subject.getAmount());
        }

    }
}
