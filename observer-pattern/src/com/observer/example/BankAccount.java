package com.observer.example;

public class BankAccount {
    private final int id;
    private final int account;
    private final String fname;
    private final String lname;
    private double amount;
    private Subject subject;

    public BankAccount(int id, int account, String fname, String lname) {
        this.id = id;
        this.account = account;
        this.fname = fname;
        this.lname = lname;
        initObservers();
    }

    public BankAccount(int id, int account, String fname, String lname, double amount) {
        this.id = id;
        this.account = account;
        this.fname = fname;
        this.lname = lname;
        this.amount = amount;
        initObservers();
    }

    public int getId() {
        return id;
    }

    public int getAccount() {
        return account;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public double getAmount() {
        return amount;
    }

    private void initObservers() {
        this.subject = new Subject();
        new SimpleLoggerObserver(subject);
        new IRSObserver(subject);
        new BankObserver(subject);
    }

    private void setAmount(double amount, String action) {
        this.amount = amount;
        subject.setState(amount, action, account);
    }

    public void withdraw(double amount){
        setAmount(this.amount - amount, "withdraw");
    }

    public void deposit(double amount){
        setAmount(this.amount + amount, "deposit");
    }
}
