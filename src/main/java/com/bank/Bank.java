package com.bank;

public class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public void manageTransaction() {
        System.out.println("Managing transactions...");
    }
}