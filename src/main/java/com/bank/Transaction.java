package com.bank;

import java.util.Date;

public class Transaction {
    protected Date date;
    protected String type;

    public Transaction(String type) {
        this.date = new Date();
        this.type = type;
    }

    public void printReceipt() {
        System.out.println("Transaction: " + type + " Date: " + date);
    }
}