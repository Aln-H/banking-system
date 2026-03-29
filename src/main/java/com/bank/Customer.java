package com.bank;

public class Customer {
    private String name;
    private String email;
    private Account account;

    public Customer(String name, String email, Account account) {
        this.name = name;
        this.email = email;
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public double checkBalance() {
        return account.getBalance();
    }
}