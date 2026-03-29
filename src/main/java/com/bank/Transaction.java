package com.bank;

import java.util.Date;

public class Transaction {
    protected Date date;
    protected String type;
    private double amount; 

    public Transaction(String type) {
        this.date = new Date();
        this.type = type;
    }

public void print() {
    System.out.println("===== TRANSACTION RECEIPT =====");
    System.out.println("Date: " + date);
    System.out.println("Type: " + type);
    System.out.println("Amount: ₹" + amount);
    System.out.println("===============================");
}
}