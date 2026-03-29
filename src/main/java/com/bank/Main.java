package com.bank;

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();

        if (atm.validatePin(1234)) {

            Account acc = new SavingsAccount("ACC001", 1000);
            Customer cust = new Customer("Tarinish", "mail@test.com", acc);

            atm.displayOptions();

            cust.deposit(500);
            cust.withdraw(300);

            MiniStatement ms = new MiniStatement();
            ms.show(acc);
        } else {
            System.out.println("Invalid PIN");
        }
    }
}