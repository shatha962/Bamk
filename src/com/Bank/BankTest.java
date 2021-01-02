package com.Bank;

public class BankTest {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();
        bank1.withdraw(1050,"savings");
        bank1.withdraw(100,"checking");
        bank1.deposite(20,"savings");
        bank1.deposite(25,"checking");
        System.out.println(bank1.getAccountnum());
        bank1.showTotal();

    }
}
