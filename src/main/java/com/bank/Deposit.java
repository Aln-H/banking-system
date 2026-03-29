package com.bank;

public class Deposit extends Transaction {
    private double amount;

    public Deposit(double amount) {
        super("Deposit");
        this.amount = amount;
    }

    public void execute(Account account) {
        account.deposit(amount);
    }
}