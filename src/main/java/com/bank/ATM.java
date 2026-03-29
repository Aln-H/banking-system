package com.bank;

public class ATM {
    private int pin = 1234;

    public boolean validatePin(int inputPin) {
        return inputPin == pin;
    }

    public void displayOptions() {
        System.out.println("1. Deposit\n2. Withdraw\n3. Balance");
    }
}