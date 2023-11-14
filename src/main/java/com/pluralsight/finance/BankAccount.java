package com.pluralsight.finance;
public class BankAccount extends FixedAsset {
    private String accountNumber;
    private double balance;
    public BankAccount(String name, String accountNumber, double balance) {
        super(name, balance);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }}
    @Override
    public double getValue() {
        return balance;
    }}

