package com.company;

public class Account {
    private static int id = 0;
    private String customerName;
    private double balance;
    private double lastTransaction;

    public Account(String cname) {
        this(cname, 0);
    }

    public Account(String cname, double baseBalance) {
        id += 1;
        balance = baseBalance;
    }

    public void makeDeposit(double amount) {
        if (amount > 0) {
            balance += amount;
            lastTransaction = amount;
        }
    }

    public void makeWithdrawal(double amount) {
        if (amount > 0) {
            balance -= amount;
            lastTransaction = -amount;
        }
    }

    public void checkLastTransaction() {
        if (lastTransaction == 0) {
            System.out.println("There was no transaction yet.");
        } else if (lastTransaction > 0) {
            System.out.println(("Deposited: " + lastTransaction));
        } else {
            System.out.println("Withdrawn: " + (-1)*lastTransaction);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
