package com.pluralsight.finance;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam's Account", "123", 12500);
        BankAccount account2 = new BankAccount("Dwight's Account", "456", 1500);
        System.out.println("Initial balances: ");
        account1.deposit(100);
        account2.deposit(100);

    }
}
