package com.Bank;
import java.util.Random;

public class Bank {
    private String accountnum;
    private double checkingbalance;
    private double savings;
    private static int numberOfAccounts;
    private static double totalMoney;

    private static String randomAccount() {
        StringBuilder accNum = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            accNum.append(r.nextInt(10));
        }
        return accNum.toString();
    }

    public Bank() {
        numberOfAccounts++;
        this.accountnum = Bank.randomAccount();
        this.savings = 1000;
        this.checkingbalance = 1000;
    }

    public double getCheckingbalance() {
        return checkingbalance;
    }

    public double getSavings() {
        return savings;
    }

    public String getAccountnum() {
        return accountnum;
    }

    public void deposite(double money, String account) {
        if (account.equals("savings")) {
            this.savings += money;
        }
        if (account.equals("checking")) {
            this.checkingbalance += money;
        }
        Bank.totalMoney += money;
    }

    public String withdraw(double money, String account) {

                if ((account.equals("savings")) && (this.getSavings() > money)) {
                    this.savings -= money;
                }
                if ((account.equals("savings")) && (this.getSavings() < money)){
                    System.out.println( "Savings is not enough");}
                 if ((account.equals("checking")) && (this.getSavings() > money)) {
                    this.checkingbalance -= money;
                }
                if ((account.equals("checking")) && (this.getSavings() < money)) {
                    System.out.println("checking balance is not enough");
                }
                Bank.totalMoney -= money;
                return "successful draw";
                }
                
    public void showTotal(){
        System.out.println(this.getSavings());
        System.out.println(this.getCheckingbalance());
    }
}
