package com.pluralsight.finance;
public class CreditCard extends FixedAsset {
    private BankAccount linkedBankAccount;
    public CreditCard(String name, BankAccount linkedBankAccount) {
        super(name, linkedBankAccount.getValue());
        this.linkedBankAccount = linkedBankAccount;
    }
    public void charge(double amount) {
        linkedBankAccount.withdraw(amount);
    }
    public void pay(double amount) {
        linkedBankAccount.deposit(amount);
    }
    @Override
    public double getValue() {
        return linkedBankAccount.getValue();
    }}