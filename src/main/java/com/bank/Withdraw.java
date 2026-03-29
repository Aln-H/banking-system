package com.bank;

public class Withdraw extends Transaction {
    private double amount;

    public Withdraw(double amount) {
        super("Withdraw");
        this.amount = amount;
    }

    public void execute(Account account) {
        account.withdraw(amount);
    }
}