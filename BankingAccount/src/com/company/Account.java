package com.company;

import java.util.Locale;
import java.util.Scanner;

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
        customerName = cname;
    }

    private void makeDeposit(double amount) {
        if (amount > 0) {
            balance += amount;
            lastTransaction = amount;
        }
    }

    private void makeWithdrawal(double amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            lastTransaction = -amount;
        }
    }

    private void checkLastTransaction() {
        if (lastTransaction == 0) {
            System.out.println("There was no transaction yet.");
        } else if (lastTransaction > 0) {
            System.out.println(("Deposited: " + lastTransaction));
        } else {
            System.out.println("Withdrawn: " + (-1)*lastTransaction);
        }
    }

    private void printMenuOptions() {
        System.out.println("========================");
        System.out.println("What would you like to do?");
        System.out.println("a) Make a deposit.");
        System.out.println("b) Make a withdrawal.");
        System.out.println("c) Check the balance.");
        System.out.println("d) View last transaction.");
        System.out.println("e) Exit.");
        System.out.println("========================");
    }

    void showMenu() throws InterruptedException {
        char option = '\0';
        double amount = 0;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Welcome, " + customerName + ".");
        System.out.println("Account ID: " + id);

        do {
            printMenuOptions();
            System.out.println();
            System.out.println("Choose option:");
            char option1 = scanner.next().charAt(0);
            option = Character.toLowerCase(option1);
            System.out.println();

            switch (option) {
                case 'a':
                    System.out.println("Enter an amount to deposit:");
                    amount = scanner.nextDouble();
                    makeDeposit(amount);
                    System.out.println();
                    break;
                case 'b':
                    System.out.println("Enter an amount to withdraw:");
                    amount = scanner.nextDouble();
                    makeWithdrawal(amount);
                    System.out.println();
                    break;
                case 'c':
                    System.out.println("Current account's balance: " + balance);
                    System.out.println();
                    break;
                case 'd':
                    checkLastTransaction();
                    break;
                case 'e':
                    break;
                default:
                    System.out.println("Entered wrong option. Try again.");
                    break;
            }
            Thread.sleep(1000);
        } while (option != 'e');
        System.out.println("Thank you for banking with us!");
    }

    public double getBalance() {
        return balance;
    }
}
